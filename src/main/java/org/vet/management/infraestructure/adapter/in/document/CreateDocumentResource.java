package org.vet.management.infraestructure.adapter.in.document;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.document.ICreateDocument;
import org.vet.management.domain.model.Document;
import org.vet.management.domain.service.DocumentService;

public class CreateDocumentResource implements ICreateDocument {
  @Inject
  DocumentService documentService;
  @Override
  public Response postDocument(Document document) {
    return Response.ok(documentService.createDocument(document)).build();
  }
}
