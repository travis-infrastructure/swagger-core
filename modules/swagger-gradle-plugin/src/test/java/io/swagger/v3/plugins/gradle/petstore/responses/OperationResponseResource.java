package io.swagger.v3.plugins.gradle.petstore.responses;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.plugins.gradle.resources.exception.NotFoundException;
import io.swagger.v3.plugins.gradle.resources.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Resource with the response in the Operation Annotation
 */
public class OperationResponseResource {
    @GET
    @Path("/responseinoperation")
    @Operation(summary = "Find Users",
            description = "Returns the Users",
            responses = {@ApiResponse(responseCode = "200", description = "Status OK")})
    public Response getUsers() throws NotFoundException {
        return Response.ok().entity(new User()).build();
    }

}
