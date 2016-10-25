package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T14:06:59.556Z")
public abstract class StorageApiService {
    public abstract Response deleteStoragePoolUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteStoragePoolUUIDPVolumeUUIDV(String UUIDP,String UUIDV,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStoragePoolUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStoragePoolUUIDPVolumeUUIDV(String UUIDP,String UUIDV,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePool(String name,String hostname,String devicePath,String authtype,String username,String secret,String path,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePoolUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePoolUUIDPVolume(String UUIDP,String name,Integer size,SecurityContext securityContext) throws NotFoundException;
}
