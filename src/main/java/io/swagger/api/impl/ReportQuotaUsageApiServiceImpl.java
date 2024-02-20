package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ReportQuotaUsageStatus;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.validation.constraints.*;
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class ReportQuotaUsageApiServiceImpl extends ReportQuotaUsageApiService {
    @Override
    public Response reportQuotaUsage(Long userId, Integer unitsUsed, Integer unitsWanted, Long inputSessionId, String txnId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
