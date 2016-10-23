package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DomainApiService;
import io.swagger.api.factories.DomainApiServiceFactory;

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

@Path("/domain")


@io.swagger.annotations.Api(description = "the domain API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class DomainApi  {
   private final DomainApiService delegate = DomainApiServiceFactory.getDomainApi();

    @DELETE
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete domain", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Domain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response deleteDomainUUID(@ApiParam(value = "ID domain",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteDomainUUID(UUID,securityContext);
    }
    @GET
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieve domain information", notes = "#To be implemented", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Domain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response getDomainUUID(@ApiParam(value = "ID domain",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDomainUUID(UUID,securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Add domain", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Domain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response postDomain(@ApiParam(value = "",required=true) @QueryParam("vmName") String vmName
,@ApiParam(value = "",required=true) @QueryParam("memory") Integer memory
,@ApiParam(value = "",required=true) @QueryParam("vmImage") String vmImage
,@ApiParam(value = "",required=true) @QueryParam("storage") Integer storage
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postDomain(vmName,memory,vmImage,storage,securityContext);
    }
    @POST
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Control domain", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Domain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response postDomainUUID(@ApiParam(value = "ID domain",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postDomainUUID(UUID,securityContext);
    }
    @PUT
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update domain configuration", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Domain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response putDomainUUID(@ApiParam(value = "ID domain",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putDomainUUID(UUID,securityContext);
    }
}
