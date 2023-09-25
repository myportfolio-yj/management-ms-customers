package org.vet.management.application.port.in.address;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Address;

@Path("/address")
public interface ICreateAddress {
  /**
   * Este método recibe un objeto tipo Address con los datos
   * para guardar en BD una nueva dirección.
   *
   * @param address Objeto que se va a guardar en la BD.
   * @return El objeto creado.
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response postAddress(Address address);
}
