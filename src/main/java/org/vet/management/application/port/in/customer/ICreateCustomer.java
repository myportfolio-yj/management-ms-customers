package org.vet.management.application.port.in.customer;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Customer;

@Path("/customer")
public interface ICreateCustomer {
  /**
   * Este método recibe un objeto tipo Customer con los datos
   * para guardar en BD un nuevo customer.
   *
   * @param customer Objeto que se va a guardar en la BD.
   * @return El objeto creado.
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response postCustomer(Customer customer);
}
