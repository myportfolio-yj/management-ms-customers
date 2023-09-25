package org.vet.management.application.port.in.document;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.vet.management.domain.model.Document;

@Path("/document")
public interface IUpdateDocument {
  /**
   * Este método busca un document por ID y lo actualiza
   * con la información del objeto document.
   *
   * @param idDocument Cadena con el identificador de la dirección en DB.
   * @param document Objeto con los datos para actualizar el registro.
   * @return El objeto actualizado.
   */
  @PUT
  @Path("/{idDocument}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Response putDocument(@PathParam("idDocument") String idDocument, Document document);
}
