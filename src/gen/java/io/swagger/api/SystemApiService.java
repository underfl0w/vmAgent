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
public abstract class SystemApiService {
    public abstract Response getSystemConfig(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSystemSpecs(SecurityContext securityContext) throws NotFoundException;
    public abstract Response putSystemConfig(SecurityContext securityContext) throws NotFoundException;
}
