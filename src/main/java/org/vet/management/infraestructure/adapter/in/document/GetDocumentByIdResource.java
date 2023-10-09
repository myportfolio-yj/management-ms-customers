package org.vet.management.infraestructure.adapter.in.document;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.document.IGetDocumentById;
import org.vet.management.domain.service.DocumentService;

public class GetDocumentByIdResource implements IGetDocumentById {
  @Inject
  DocumentService documentService;
  @Override
  public Response getDocumentById(String idDocument) {
    return Response.ok(documentService.getDocumentById(idDocument)).build();
  }
}
