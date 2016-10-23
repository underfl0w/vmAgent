package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.api.impl.domain.Delete;

import io.swagger.api.NotFoundException;

import java.util.UUID;
import io.swagger.api.impl.domain.Create;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-22T20:34:14.886Z")
public class DomainApiServiceImpl extends DomainApiService {

    @Override
    public Response deleteDomainUUID(Integer UUID, SecurityContext securityContext) throws NotFoundException {
        UUID vmUuid = java.util.UUID.fromString(UUID.toString());
        Delete deleted = new Delete();
        if(deleted.deleteVM(vmUuid)) {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "VM deleted")).build();

        } else {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "VM not deleted")).build();

        }
    }
    @Override
    public Response getDomainUUID(Integer UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postDomain(String vmName, Integer memory, String vmImage, Integer storage, SecurityContext securityContext) throws NotFoundException {
        UUID vmUuid = UUID.randomUUID();
        Create creates = new Create();
        boolean test = creates.createVM(vmName,vmUuid,memory,vmImage);
        if(test == true){
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, vmUuid.toString())).build();
        }
        else {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Something went wrong")).build();

        }
    }
    @Override
    public Response postDomainUUID(Integer UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response putDomainUUID(Integer UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }


}
