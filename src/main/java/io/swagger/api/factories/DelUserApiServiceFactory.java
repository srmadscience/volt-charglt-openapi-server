package io.swagger.api.factories;

import io.swagger.api.DelUserApiService;
import io.swagger.api.impl.DelUserApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class DelUserApiServiceFactory {
    private final static DelUserApiService service = new DelUserApiServiceImpl();

    public static DelUserApiService getDelUserApi() {
        return service;
    }
}
