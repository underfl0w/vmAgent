package io.swagger.api.factories;

import io.swagger.api.SystemApiService;
import io.swagger.api.impl.SystemApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T14:06:59.556Z")
public class SystemApiServiceFactory {
    private final static SystemApiService service = new SystemApiServiceImpl();

    public static SystemApiService getSystemApi() {
        return service;
    }
}
