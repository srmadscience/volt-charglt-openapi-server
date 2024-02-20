package io.swagger.client.api;

import io.swagger.client.*;
import io.swagger.client.model.*;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.voltdb.VoltTable;
import org.voltdb.VoltType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import org.voltdb.client.ClientResponse;
import org.voltdb.client.Client;
import org.voltdb.client.ProcCallException;
import java.io.IOException;
import org.voltdb.client.ClientConfig;
import org.voltdb.client.ClientFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.voltdb.client.ClientResponseWithPartitionKey;
import jakarta.ws.rs.core.Response;

public class ChargingdemoprocsApiVolt {
    
    public static final int RESPONSE_CREATED = 201;
    public static final int RESPONSE_BAD_REQUEST = 400;
    public static final int RESPONSE_UNAUTHORIZED = 401;
    public static final int RESPONSE_FORBIDDEN = 403;
    public static final int RESPONSE_METHOD_NOT_ALLOWED = 405;
    public static final int RESPONSE_CONFLICT = 409;
    public static final int RESPONSE_INTERNAL_SERVER_ERROR = 500;
    public static final int RESPONSE_UNKNOWN = 0;

    
    public static final byte RESPONSE_VOLT_PROC_OK = 9;
    public static final byte RESPONSE_VOLT_PROC_FK_NOT_FOUND = 10;
    public static final byte RESPONSE_VOLT_PROC_NOT_OK = 11;

    public static final int RESPONSE_GOOD_START = 0;
    public static final int RESPONSE_GOOD_END = 100;

    Gson json = null;
    Client c = null;


    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response getAndLockUser(java.lang.Long body) throws io.swagger.api.NotFoundException {
        
        info("getAndLockUser: " + body);
        // Return object
        io.swagger.model.UserObject objectToReturn = null;

        // Type for return object
        final Type userObject_type = new TypeToken<io.swagger.model.UserObject>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("GetAndLockUser", body);
            StatusAndData sad = unloadVoltTable( cr, userObject_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (io.swagger.model.UserObject) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response reportQuotaUsage(java.lang.Long userId, java.lang.Integer unitsUsed, java.lang.Integer unitsWanted, java.lang.Long inputSessionId, java.lang.String txnId) throws io.swagger.api.NotFoundException {
        
        info("reportQuotaUsage: " + userId + " " + unitsUsed + " " + unitsWanted + " " + inputSessionId + " " + txnId);
        // Return object
        io.swagger.model.ReportQuotaUsageStatus objectToReturn = null;

        // Type for return object
        final Type reportQuotaUsageStatus_type = new TypeToken<io.swagger.model.ReportQuotaUsageStatus>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("ReportQuotaUsage", userId,unitsUsed,unitsWanted,inputSessionId,txnId);
            StatusAndData sad = unloadVoltTable( cr, reportQuotaUsageStatus_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (io.swagger.model.ReportQuotaUsageStatus) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response updateLockedUser(java.lang.Long userId, java.lang.Long sessionId, java.lang.String jsonPayload, java.lang.String deltaOperationName) throws io.swagger.api.NotFoundException {
        
        info("updateLockedUser: " + userId + " " + sessionId + " " + jsonPayload + " " + deltaOperationName);
        // Return object
        java.lang.String objectToReturn = null;

        final Type string_type = new TypeToken<java.lang.String>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("UpdateLockedUser", userId,sessionId,jsonPayload,deltaOperationName);
            StatusAndData sad = unloadVoltTable( cr, string_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (java.lang.String) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response addCredit(java.lang.Long userId, java.lang.Long extraCredit, java.lang.String txnId) throws io.swagger.api.NotFoundException {
        
        info("addCredit: " + userId + " " + extraCredit + " " + txnId);
        // Return object
        io.swagger.model.AddCreditUserStatus objectToReturn = null;

        // Type for return object
        final Type addCreditUserStatus_type = new TypeToken<io.swagger.model.AddCreditUserStatus>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("AddCredit", userId,extraCredit,txnId);
            StatusAndData sad = unloadVoltTable( cr, addCreditUserStatus_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (io.swagger.model.AddCreditUserStatus) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response delUser(java.lang.Long userId) throws io.swagger.api.NotFoundException {
        
        info("delUser: " + userId);
        // Return object
        java.lang.String objectToReturn = null;

        final Type string_type = new TypeToken<java.lang.String>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("DelUser", userId);
            StatusAndData sad = unloadVoltTable( cr, string_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (java.lang.String) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response getUser(java.lang.Long userId) throws io.swagger.api.NotFoundException {
        
        info("getUser: " + userId);
        // Return object
        io.swagger.model.UserObject objectToReturn = null;

        // Type for return object
        final Type userObject_type = new TypeToken<io.swagger.model.UserObject>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("GetUser", userId);
            StatusAndData sad = unloadVoltTable( cr, userObject_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (io.swagger.model.UserObject) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }

    @SuppressWarnings("unchecked")
    public jakarta.ws.rs.core.Response upsertUser(java.lang.Long body) throws io.swagger.api.NotFoundException {
        
        info("upsertUser: " + body);
        // Return object
        java.lang.String objectToReturn = null;

        final Type string_type = new TypeToken<java.lang.String>(){}.getType();


        try {
            getClient();
            ClientResponse cr = c.callProcedure("UpsertUser", body);
            StatusAndData sad = unloadVoltTable( cr, string_type);
            if (sad.statusCode >= RESPONSE_GOOD_START && sad.statusCode  <= RESPONSE_GOOD_END) {
                objectToReturn = (java.lang.String) sad.returnObject;
                return Response.ok().entity(objectToReturn).build();
            }

            return Response.serverError().build();

            
        } catch (Exception e) {
            return Response.serverError().build();
        }
        
    }
    private String toJson(Object thingsToMakeIntoJson) {
        initJson();
        return json.toJson(thingsToMakeIntoJson);
        }

    private Object fromJson(String objectThatIsJson, Type type) throws Exception {
        initJson();
        Object theObject = null;
        try {
            theObject = json.fromJson(objectThatIsJson, type);
        } catch (Exception e) {
            throw new Exception("Unable to parse JSON:" + e.getMessage());
        }

        return theObject;
        }

    private void initJson() {
        if (json == null)
            {
            json = new Gson();
            }
        }


   private StatusAndData unloadVoltTable(ClientResponse cr, Type type) throws Exception {

        StatusAndData sad = new StatusAndData();

        sad.statusCode = RESPONSE_CREATED;

        if (cr.getStatus() == ClientResponse.SUCCESS) {
            
            String payload = null;
            
            if (cr.getResults()[0].getRowCount() == 1) {
                cr.getResults()[0].advanceRow();
                sad.statusCode = cr.getResults()[0].getLong("STATUS_CODE");
                payload = cr.getResults()[0].getString("PAYLOAD");
            } else {
                StringBuffer b = new StringBuffer();
                char sepChar = '[';
                
                while (cr.getResults()[0].advanceRow()) {
                    sad.statusCode = cr.getResults()[0].getLong("STATUS_CODE");
                    b.append(cr.getResults()[0].getString("PAYLOAD"));
                    b.append(sepChar);
                    sepChar = ',';
                }
                b.append(']');
                payload = b.toString();
            }

            if (type != null && payload != null && payload.length() > 0) {
                sad.returnObject = fromJson(payload, type);
                sad.returnObjectClassName = type.getClass().getName();
            }

        } else { 
            sad.statusCode = RESPONSE_INTERNAL_SERVER_ERROR;
            sad.returnObject = cr.getStatusString();
        } 

        return sad;
    }



    private StatusAndData unloadVoltTable(ClientResponseWithPartitionKey[] cr, Type type) throws Exception {

        StatusAndData sad = new StatusAndData();

        sad.statusCode = RESPONSE_CREATED;

        String payload = null;
        StringBuffer b = new StringBuffer();
        char sepChar = '[';

        for (int i = 0; i < cr.length; i++) {

            if (cr[i].response.getStatus() == ClientResponse.SUCCESS) {

                while (cr[i].response.getResults()[0].advanceRow()) {
                    sad.statusCode = cr[i].response.getResults()[0].getLong("STATUS_CODE");
                    b.append(cr[i].response.getResults()[0].getString("PAYLOAD"));
                    b.append(sepChar);
                    sepChar = ',';
                }

            } else {
                sad.statusCode = RESPONSE_INTERNAL_SERVER_ERROR;
                sad.returnObject = cr[0].response.getStatusString();
                return sad;
            }

        }

        b.append(']');
        payload = b.toString();

        if (type != null && payload != null && payload.length() > 0) {
            sad.returnObject = fromJson(payload, type);
            sad.returnObjectClassName = type.getClass().getName();
        }

        return sad;
    }
   private Client getClient() throws Exception {

        if (c == null) {
            c = connectVoltDB(System.getenv("voltCommaDelimitedHostnames"));
        }

        return c;
    }

    private static Client connectVoltDB(String commaDelimitedHostnames) throws Exception {
        Client client = null;
        ClientConfig config = null;

        if (commaDelimitedHostnames == null) {
            throw new Exception("No hosts provided...");
            }

        try {

            config = new ClientConfig(); // "admin", "idontknow");
            config.setTopologyChangeAware(true);
            //config.setReconnectOnConnectionLoss(true);

            client = ClientFactory.createClient(config);

            String[] hostnameArray = commaDelimitedHostnames.split(",");

            for (String element : hostnameArray) {
                info("Connect to " + element + "...");
                try {
                    client.createConnection(element);
                } catch (Exception e) {
                    error(e);
                }
            }

            if (client.getConnectedHostList().size() == 0) {
                throw new Exception("No hosts usable...");
            }

            info("Connected to Volt");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("VoltDB connection failed.." + e.getMessage(), e);
        }

        return client;

    }

    public static void info(String message) {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate + ":" + message);

    }

    public static void debug(String message) {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate + ":" + message);

    }

    public static void error(Exception e) {

        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate +":" + e.getClass().getName() + ":" + e.getMessage());

    }

     }
