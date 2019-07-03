package io.swagger.v3.plugin.maven.petstore.petstore.operation;

import io.swagger.v3.plugin.maven.resources.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.servers.Server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Resource With a Hidden Operation
 */
public class ServerOperationResource {
    @Path("/serversoperation")
    @GET
    @Operation(operationId = "Pets", description = "Pets Example",
            servers = {
                    @Server(description = "server 2", url = "http://foo2")
            }
    )
    public Pet getPet() {
        return new Pet();
    }
}
