package io.swagger.api.factories;

import io.swagger.api.GetUserApiService;
import io.swagger.api.impl.GetUserApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class GetUserApiServiceFactory {
    private final static GetUserApiService service = new GetUserApiServiceImpl();

    public static GetUserApiService getGetUserApi() {
        return service;
    }
}
