package org.vet.management.application.port.in.document;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/document")
public interface IGetDocumentById {
  /**
   * Este método debe retornar un documento según el ID que le debe llegar como parámetro.
   *
   * @param idDocument Identificador del documento.
   * @return Un documento.
   */
  @GET
  @Path("/{idDocument}")
  @Produces(MediaType.APPLICATION_JSON)
  Response getDocumentById(@PathParam("idDocument") String idDocument);
}
