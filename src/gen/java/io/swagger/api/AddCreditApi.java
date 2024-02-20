package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AddCreditApiService;
import io.swagger.api.factories.AddCreditApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.AddCreditUserStatus;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import jakarta.servlet.ServletConfig;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.ws.rs.*;
import jakarta.validation.constraints.*;


@Path("/addCredit")


@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class AddCreditApi  {
   private final AddCreditApiService delegate;

   public AddCreditApi(@Context ServletConfig servletContext) {
      AddCreditApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AddCreditApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AddCreditApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AddCreditApiServiceFactory.getAddCreditApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @Operation(summary = "Adds Credit", description = "Adds Credit", tags={ "chargingdemoprocs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Added", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = AddCreditUserStatus.class))),
        
        @ApiResponse(responseCode = "400", description = "No Such User", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))) })
    public Response addCredit(@Parameter(in = ParameterIn.PATH, description = "User ID",required=true) @PathParam("userId") Long userId,@Parameter(in = ParameterIn.PATH, description = "Credit Delta",required=true) @PathParam("extraCredit") Long extraCredit,@Parameter(in = ParameterIn.PATH, description = "Transaction ID",required=true) @PathParam("txnId") String txnId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addCredit(userId,extraCredit,txnId,securityContext);
    }
}
