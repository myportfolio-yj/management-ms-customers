package org.vet.management.infraestructure.adapter.in.document;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.document.IDeleteDocument;
import org.vet.management.domain.service.DocumentService;

public class DeleteDocumentResource implements IDeleteDocument {
  @Inject
  DocumentService documentService;
  @Override
  public Response deleteDocument(String idDocument) {
    return Response.ok(documentService.deleteDocument(idDocument)).build();
  }
}
