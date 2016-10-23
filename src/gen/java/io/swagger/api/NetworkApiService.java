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
public abstract class NetworkApiService {
    public abstract Response deleteNetworkUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getNetworkUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNetwork(String name,String domain,String mode,String ipaddress,String netmask,String dhcpstart,String dhcpend,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postNetworkUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putNetworkUUID(Integer UUID,SecurityContext securityContext) throws NotFoundException;
}
