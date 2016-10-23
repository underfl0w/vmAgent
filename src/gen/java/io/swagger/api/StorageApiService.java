package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public abstract class StorageApiService {
    public abstract Response deleteStoragePoolUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteStoragePoolUUIDPVolumeUUIDV(Integer UUIDP,Integer UUIDV,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStoragePoolUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStoragePoolUUIDPVolumeUUIDV(Integer UUIDP,Integer UUIDV,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePool(String name,String hostname,String devicePath,String authtype,String username,String secret,String path,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePoolUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postStoragePoolUUIDPVolume(Integer UUIDP,String name,Integer size,SecurityContext securityContext) throws NotFoundException;
}
