package io.swagger.api.factories;

import io.swagger.api.ReportQuotaUsageApiService;
import io.swagger.api.impl.ReportQuotaUsageApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class ReportQuotaUsageApiServiceFactory {
    private final static ReportQuotaUsageApiService service = new ReportQuotaUsageApiServiceImpl();

    public static ReportQuotaUsageApiService getReportQuotaUsageApi() {
        return service;
    }
}
