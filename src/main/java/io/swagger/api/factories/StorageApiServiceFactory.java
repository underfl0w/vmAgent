package io.swagger.api.factories;

import io.swagger.api.StorageApiService;
import io.swagger.api.impl.StorageApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class StorageApiServiceFactory {
    private final static StorageApiService service = new StorageApiServiceImpl();

    public static StorageApiService getStorageApi() {
        return service;
    }
}
