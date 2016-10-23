package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StorageApiService;
import io.swagger.api.factories.StorageApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/storage")


@io.swagger.annotations.Api(description = "the storage API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class StorageApi  {
   private final StorageApiService delegate = StorageApiServiceFactory.getStorageApi();

    @DELETE
    @Path("/pool/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete storage pool", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Status 401", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Status 404", response = void.class) })
    public Response deleteStoragePoolUUID(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteStoragePoolUUID(UUID,securityContext);
    }
    @DELETE
    @Path("/pool/{UUIDP}/volume/{UUIDV}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete storage volume", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Status 401", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Status 404", response = void.class) })
    public Response deleteStoragePoolUUIDPVolumeUUIDV(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUIDP") Integer UUIDP
,@ApiParam(value = "ID Storage volume",required=true) @PathParam("UUIDV") Integer UUIDV
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteStoragePoolUUIDPVolumeUUIDV(UUIDP,UUIDV,securityContext);
    }
    @GET
    @Path("/pool/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "retrieve storage pool information", notes = "#To be implemented", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Status 401", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Status 404", response = void.class) })
    public Response getStoragePoolUUID(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStoragePoolUUID(UUID,securityContext);
    }
    @GET
    @Path("/pool/{UUIDP}/volume/{UUIDV}")
    
    
    @io.swagger.annotations.ApiOperation(value = "retrieve storage volume information", notes = "#To be implemented", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response getStoragePoolUUIDPVolumeUUIDV(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUIDP") Integer UUIDP
,@ApiParam(value = "ID Storage volume",required=true) @PathParam("UUIDV") Integer UUIDV
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStoragePoolUUIDPVolumeUUIDV(UUIDP,UUIDV,securityContext);
    }
    @POST
    @Path("/pool")
    
    
    @io.swagger.annotations.ApiOperation(value = "Add pool", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Status 401", response = void.class) })
    public Response postStoragePool(@ApiParam(value = "",required=true) @QueryParam("Name") String name
,@ApiParam(value = "",required=true) @QueryParam("Hostname") String hostname
,@ApiParam(value = "",required=true) @QueryParam("Device Path") String devicePath
,@ApiParam(value = "",required=true) @QueryParam("Authtype") String authtype
,@ApiParam(value = "",required=true) @QueryParam("username") String username
,@ApiParam(value = "",required=true) @QueryParam("secret") String secret
,@ApiParam(value = "",required=true) @QueryParam("Path") String path
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postStoragePool(name,hostname,devicePath,authtype,username,secret,path,securityContext);
    }
    @POST
    @Path("/pool/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Control storage pool", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response postStoragePoolUUID(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postStoragePoolUUID(UUID,securityContext);
    }
    @POST
    @Path("/pool/{UUIDP}/volume")
    
    
    @io.swagger.annotations.ApiOperation(value = "Add volume", notes = "", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Storage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = String.class, responseContainer = "List") })
    public Response postStoragePoolUUIDPVolume(@ApiParam(value = "ID Storage pool",required=true) @PathParam("UUIDP") Integer UUIDP
,@ApiParam(value = "",required=true) @QueryParam("Name") String name
,@ApiParam(value = "") @QueryParam("Size") Integer size
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postStoragePoolUUIDPVolume(UUIDP,name,size,securityContext);
    }
}
