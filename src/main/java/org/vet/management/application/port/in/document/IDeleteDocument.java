package org.vet.management.application.port.in.document;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/document")
public interface IDeleteDocument {
  /**
   * Este método elimina un documento buscándolo por su ID.
   *
   * @param idDocument Cadena con el identificador de la dirección en DB.
   * @return El objeto eliminado.
   */
  @DELETE
  @Path("/{idDocument}")
  @Produces(MediaType.APPLICATION_JSON)
  Response deleteDocument(@PathParam("idDocument") String idDocument);
}
