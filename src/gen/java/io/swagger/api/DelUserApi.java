package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DelUserApiService;
import io.swagger.api.factories.DelUserApiServiceFactory;

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


@Path("/delUser")


@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class DelUserApi  {
   private final DelUserApiService delegate;

   public DelUserApi(@Context ServletConfig servletContext) {
      DelUserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DelUserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DelUserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DelUserApiServiceFactory.getDelUserApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @Operation(summary = "Delete User", description = "Delete User", tags={ "chargingdemoprocs" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Success", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "202", description = "Success", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Error", content = @Content(mediaType = "application/json;charset&amp;#x3D;utf-8", schema = @Schema(implementation = String.class))) })
    public Response delUser(@Parameter(in = ParameterIn.PATH, description = "User ID",required=true) @PathParam("userId") Long userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.delUser(userId,securityContext);
    }
}
