package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SystemApiService;
import io.swagger.api.factories.SystemApiServiceFactory;

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

@Path("/system")


@io.swagger.annotations.Api(description = "the system API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class SystemApi  {
   private final SystemApiService delegate = SystemApiServiceFactory.getSystemApi();

    @GET
    @Path("/config")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieve system configuration", notes = "#To be implemented", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "System", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response getSystemConfig(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSystemConfig(securityContext);
    }
    @GET
    @Path("/specs")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieve system information", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "System", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response getSystemSpecs(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSystemSpecs(securityContext);
    }
    @PUT
    @Path("/config")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update system configuration", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "System", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response putSystemConfig(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putSystemConfig(securityContext);
    }
}
