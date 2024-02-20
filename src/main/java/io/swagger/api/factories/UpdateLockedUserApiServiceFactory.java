package io.swagger.api.factories;

import io.swagger.api.UpdateLockedUserApiService;
import io.swagger.api.impl.UpdateLockedUserApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class UpdateLockedUserApiServiceFactory {
    private final static UpdateLockedUserApiService service = new UpdateLockedUserApiServiceImpl();

    public static UpdateLockedUserApiService getUpdateLockedUserApi() {
        return service;
    }
}
