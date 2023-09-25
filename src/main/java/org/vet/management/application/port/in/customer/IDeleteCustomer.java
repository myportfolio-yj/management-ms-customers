package org.vet.management.application.port.in.customer;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/customer")
public interface IDeleteCustomer {
  /**
   * Este método elimina un cliente buscándolo por su ID.
   *
   * @param idCustomer Cadena con el identificador del cliente en DB.
   * @return El objeto eliminado.
   */
  @DELETE
  @Path("/{idCustomer}")
  @Produces(MediaType.APPLICATION_JSON)
  Response deleteCustomer(@PathParam("idCustomer") String idCustomer);
}
