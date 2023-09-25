package org.vet.management.application.port.in.customer;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Customer;

@Path("/customer")
public interface IUpdateCustomer {
  /**
   * Este método busca un cliente por ID y lo actualiza
   * con la información del objeto customer.
   *
   * @param idCustomer Cadena con el identificador del cliente en DB.
   * @param customer Objeto con los datos para actualizar el registro.
   * @return El objeto actualizado.
   */
  @PUT
  @Path("/{idCustomer}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putAddress(@PathParam("idCustomer") String idCustomer, Customer customer);
}
