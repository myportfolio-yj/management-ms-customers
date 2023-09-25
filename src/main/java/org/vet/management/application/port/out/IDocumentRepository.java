package org.vet.management.application.port.out;

import org.vet.management.domain.model.Document;

import java.util.List;

public interface IDocumentRepository {
  List<Document> getAllDocument();
  Document getDocumentById(String id);
  Document createDocument(Document document);
  Document updateDocument(String id, Document document);
  Document deleteDocument(String id);
}
