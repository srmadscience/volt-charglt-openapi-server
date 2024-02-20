package io.swagger.api.factories;

import io.swagger.api.AddCreditApiService;
import io.swagger.api.impl.AddCreditApiServiceImpl;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-02-20T20:15:17.091469Z[Europe/Dublin]")
public class AddCreditApiServiceFactory {
    private final static AddCreditApiService service = new AddCreditApiServiceImpl();

    public static AddCreditApiService getAddCreditApi() {
        return service;
    }
}
