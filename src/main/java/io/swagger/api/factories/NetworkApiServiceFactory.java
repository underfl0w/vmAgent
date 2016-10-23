package io.swagger.api.factories;

import io.swagger.api.NetworkApiService;
import io.swagger.api.impl.NetworkApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class NetworkApiServiceFactory {
    private final static NetworkApiService service = new NetworkApiServiceImpl();

    public static NetworkApiService getNetworkApi() {
        return service;
    }
}
