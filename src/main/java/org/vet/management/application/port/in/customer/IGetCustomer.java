package org.vet.management.application.port.in.customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/customer")
public interface IGetCustomer {
  /**
   * Este método debe retornar todos los clientes que están activas
   *
   * @return Una lista de clientes.
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getCustomer();
}
