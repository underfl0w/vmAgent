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
public abstract class DomainApiService {
    public abstract Response deleteDomainUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDomainUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postDomain(String vmName,Integer memory,String vmImage,Integer storage,SecurityContext securityContext) throws NotFoundException;
    public abstract Response postDomainUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putDomainUUID(String UUID,SecurityContext securityContext) throws NotFoundException;
}
