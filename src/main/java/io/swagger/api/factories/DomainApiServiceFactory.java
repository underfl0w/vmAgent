package io.swagger.api.factories;

import io.swagger.api.DomainApiService;
import io.swagger.api.impl.DomainApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class DomainApiServiceFactory {
    private final static DomainApiService service = new DomainApiServiceImpl();

    public static DomainApiService getDomainApi() {
        return service;
    }
}
