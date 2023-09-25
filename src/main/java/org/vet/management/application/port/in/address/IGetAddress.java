package org.vet.management.application.port.in.address;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IGetAddress {
  /**
   * Este método debe retornar todas las direcciones que están activas
   *
   * @return Una lista de direcciones.
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getAddresses();
}
