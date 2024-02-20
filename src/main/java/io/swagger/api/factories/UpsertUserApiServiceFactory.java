package io.swagger.api.factories;

import io.swagger.api.UpsertUserApiService;
import io.swagger.api.impl.UpsertUserApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class UpsertUserApiServiceFactory {
    private final static UpsertUserApiService service = new UpsertUserApiServiceImpl();

    public static UpsertUserApiService getUpsertUserApi() {
        return service;
    }
}
