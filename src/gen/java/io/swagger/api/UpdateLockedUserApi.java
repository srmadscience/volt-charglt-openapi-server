package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UpdateLockedUserApiService;
import io.swagger.api.factories.UpdateLockedUserApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


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


@Path("/UpdateLockedUser")


@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class UpdateLockedUserApi  {
   private final UpdateLockedUserApiService delegate;

   public UpdateLockedUserApi(@Context ServletConfig servletContext) {
      UpdateLockedUserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UpdateLockedUserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UpdateLockedUserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UpdateLockedUserApiServiceFactory.getUpdateLockedUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @Operation(summary = "UpdateLockedUser", description = "UpdateLockedUser", tags={ "chargingdemoprocs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Locked", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "No Such User", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))) })
    public Response updateLockedUser(@Parameter(in = ParameterIn.PATH, description = "userId",required=true) @PathParam("userId") Long userId,@Parameter(in = ParameterIn.PATH, description = "sessionId",required=true) @PathParam("sessionId") Long sessionId,@Parameter(in = ParameterIn.PATH, description = "jsonPayload",required=true) @PathParam("jsonPayload") String jsonPayload,@Parameter(in = ParameterIn.PATH, description = "deltaOperationName",required=true) @PathParam("deltaOperationName") String deltaOperationName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateLockedUser(userId,sessionId,jsonPayload,deltaOperationName,securityContext);
    }
}
