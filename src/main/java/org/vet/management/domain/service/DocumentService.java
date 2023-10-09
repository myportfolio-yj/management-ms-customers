package org.vet.management.domain.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.vet.management.application.port.out.IDocumentRepository;
import org.vet.management.domain.model.Document;

import java.util.List;
@ApplicationScoped
public class DocumentService {
  @Inject
  IDocumentRepository documentRepository;
  public List<Document> getAllUDocument() {
    return documentRepository.getAllDocument();
  }

  public Document getDocumentById(String id) {
    return documentRepository.getDocumentById(id);
  }

  public Document createDocument(Document document) {
    return documentRepository.createDocument(document);
  }

  public Document updateDocument(String id, Document document) {
    return documentRepository.updateDocument(id, document);
  }

  public Document deleteDocument(String id) {
    return documentRepository.deleteDocument(id);
  }
}
