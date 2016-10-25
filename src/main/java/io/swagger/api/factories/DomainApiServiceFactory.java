package io.swagger.api.factories;

import io.swagger.api.DomainApiService;
import io.swagger.api.impl.DomainApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T14:06:59.556Z")
public class DomainApiServiceFactory {
    private final static DomainApiService service = new DomainApiServiceImpl();

    public static DomainApiService getDomainApi() {
        return service;
    }
}
