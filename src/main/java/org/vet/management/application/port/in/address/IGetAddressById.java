package org.vet.management.application.port.in.address;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IGetAddressById {
  /**
   * Este método debe retornar una dirección según el ID que le debe llegar como parámetro.
   *
   * @param idAddress Identificador de la dirección.
   * @return Una dirección.
   */
  @GET
  @Path("/{idAddress}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getUserById(@PathParam("idAddress") String idAddress);
}
