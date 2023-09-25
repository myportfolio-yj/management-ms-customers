package org.vet.management.application.port.in.customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/customer")
public interface IGetCustomerById {
  /**
   * Este método debe retornar un cliente según el ID que le debe llegar como parámetro.
   *
   * @param idCustomer Identificador del cliente.
   * @return Un cliente.
   */
  @GET
  @Path("/{idCustomer}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getUserById(@PathParam("idCustomer") String idCustomer);
}
