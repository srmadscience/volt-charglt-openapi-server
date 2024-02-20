package io.swagger.api.factories;

import io.swagger.api.GetAndLockUserApiService;
import io.swagger.api.impl.GetAndLockUserApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class GetAndLockUserApiServiceFactory {
    private final static GetAndLockUserApiService service = new GetAndLockUserApiServiceImpl();

    public static GetAndLockUserApiService getGetAndLockUserApi() {
        return service;
    }
}
