package org.vet.management.application.port.in.address;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/address")
public interface IDeleteAddress {
  /**
   * Este método elimina una dirección buscándola por su ID.
   *
   * @param idAddress Entero con el identificador de la dirección en DB.
   * @return El objeto eliminado.
   */
  @DELETE
  @Path("/{idAddress}")
  @Produces(MediaType.APPLICATION_JSON)
  Response deleteAddress(@PathParam("idAddress") String idAddress);
}
