package org.vet.management.infraestructure.adapter.in.document;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.vet.management.application.port.in.document.IUpdateDocument;
import org.vet.management.domain.model.Document;
import org.vet.management.domain.service.DocumentService;

public class UpdateDocumentResource implements IUpdateDocument {
  @Inject
  DocumentService documentService;
  @Override
  public Response putDocument(String idDocument, Document document) {
    return Response.ok(documentService.updateDocument(idDocument, document)).build();
  }
}
