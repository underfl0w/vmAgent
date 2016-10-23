package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.NetworkApiService;
import io.swagger.api.factories.NetworkApiServiceFactory;

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

@Path("/network")


@io.swagger.annotations.Api(description = "the network API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class NetworkApi  {
   private final NetworkApiService delegate = NetworkApiServiceFactory.getNetworkApi();

    @DELETE
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Remove network", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response deleteNetworkUUID(@ApiParam(value = "ID network",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteNetworkUUID(UUID,securityContext);
    }
    @GET
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "retrieve network information", notes = "#To be implemented", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response getNetworkUUID(@ApiParam(value = "ID network",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNetworkUUID(UUID,securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Add network", notes = "", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Status 401", response = String.class, responseContainer = "List") })
    public Response postNetwork(@ApiParam(value = "",required=true) @QueryParam("Name") String name
,@ApiParam(value = "",required=true) @QueryParam("domain") String domain
,@ApiParam(value = "",required=true) @QueryParam("mode") String mode
,@ApiParam(value = "",required=true) @QueryParam("ipaddress") String ipaddress
,@ApiParam(value = "",required=true) @QueryParam("netmask") String netmask
,@ApiParam(value = "",required=true) @QueryParam("dhcpstart") String dhcpstart
,@ApiParam(value = "",required=true) @QueryParam("dhcpend") String dhcpend
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postNetwork(name,domain,mode,ipaddress,netmask,dhcpstart,dhcpend,securityContext);
    }
    @POST
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Control network", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response postNetworkUUID(@ApiParam(value = "ID network",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postNetworkUUID(UUID,securityContext);
    }
    @PUT
    @Path("/{UUID}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update network config", notes = "", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "auth")
    }, tags={ "Network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Status 200", response = void.class) })
    public Response putNetworkUUID(@ApiParam(value = "ID network",required=true) @PathParam("UUID") Integer UUID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putNetworkUUID(UUID,securityContext);
    }
}
