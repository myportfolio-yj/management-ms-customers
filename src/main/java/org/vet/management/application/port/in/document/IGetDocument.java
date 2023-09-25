package org.vet.management.application.port.in.document;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/document")
public interface IGetDocument {
  /**
   * Este método debe retornar todos los documentos que están activas
   *
   * @return Una lista de documentos.
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  Response getDocument();
}
