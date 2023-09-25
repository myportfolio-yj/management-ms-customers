package org.vet.management.application.port.in.address;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Address;

@Path("/address")
public interface IUpdateAddress {
  /**
   * Este método busca una dirección por ID y lo actualiza
   * con la información del objeto address.
   *
   * @param idAddress Cadena con el identificador de la dirección en DB.
   * @param address Objeto con los datos para actualizar el registro.
   * @return El objeto actualizado.
   */
  @PUT
  @Path("/{idAddress}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putAddress(@PathParam("idAddress") String idAddress, Address address);
}
