package io.swagger.api.impl;

import io.swagger.api.*;

import java.util.UUID;

import io.swagger.api.NotFoundException;
import io.swagger.api.impl.func.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/*
    Class that is being used every time a /DOMAIN/ request is made.
 */

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-25T14:06:59.556Z")
public class DomainApiServiceImpl extends DomainApiService {
    // Regex to verify a UUID is submitted to the API.
    String regex = "^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$";

    @Override
    public Response deleteDomainUUID(String UUIDV, SecurityContext securityContext) throws NotFoundException {

        if (UUIDV.matches(regex)) {

            UUID vmUuid = java.util.UUID.fromString(UUIDV.toString());

            Delete deleted = new Delete();
            if (deleted.deleteDomain(vmUuid)) {
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "VM deleted")).build();
            } else {
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "VM not deleted")).build();

            }
        } else {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Not a valid UUID")).build();

        }
    }

    @Override
    public Response getDomainUUID(String UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response postDomain(String vmName, Integer memory, String vmImage, Integer storage, SecurityContext securityContext) throws NotFoundException {
        UUID vmUuid = UUID.randomUUID();
        UUID storageUuid = UUID.randomUUID();

        Create creates = new Create();
        boolean test = creates.createDomain(vmName, vmUuid, memory, vmImage,storageUuid);
        if (test == true) {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, vmUuid.toString())).build();
        } else {
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Something went wrong")).build();

        }
    }

    @Override
    public Response postDomainUUID(String UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response putDomainUUID(String UUID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
