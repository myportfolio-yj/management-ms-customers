package org.vet.management.infraestructure.adapter.in.document;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.document.IGetDocument;
import org.vet.management.domain.service.DocumentService;

public class GetDocumentResource implements IGetDocument {
  @Inject
  DocumentService documentService;
  @Override
  public Response getDocument() {
    return Response.ok(documentService.getAllUDocument()).build();
  }
}
