package org.vet.management.infraestructure.adapter.out;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.vet.management.application.port.out.IDocumentRepository;
import org.vet.management.domain.model.Document;
import org.vet.management.domain.model.DocumentEntity;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@ApplicationScoped
public class DocumentRepository implements PanacheMongoRepository<DocumentEntity>, IDocumentRepository {
  @Override
  public List<Document> getAllDocument() {
    return listAll().stream().map(p -> {
      Document document = new Document();
      document.setId(p.id.toString());
      document.setDocumentType(p.getDocumentType());
      document.setDocumentNumber(p.getDocumentNumber());
      return document;
    }).toList();
  }

  @Override
  public Document getDocumentById(String id) {
    DocumentEntity documentEntity = findById(new ObjectId(id));
    if(Objects.isNull(documentEntity)) {
      return new Document();
    }
    Document document = new Document();
    document.setId(documentEntity.id.toString());
    document.setDocumentNumber(documentEntity.getDocumentNumber());
    document.setDocumentType(documentEntity.getDocumentType());
    return document;
  }

  @Override
  public Document createDocument(Document document) {
    DocumentEntity documentEntity = new DocumentEntity();
    documentEntity.setDocumentNumber(document.getDocumentNumber());
    documentEntity.setDocumentType(document.getDocumentType());
    documentEntity.persist();
    Document document2 = new Document();
    document2.setId(documentEntity.id.toString());
    document2.setDocumentType(documentEntity.documentType);
    document2.setDocumentNumber(documentEntity.documentNumber);
    return document2;
  }

  @Override
  public Document updateDocument(String id, Document document) {
    DocumentEntity documentEntity = findById(new ObjectId(id));
    if(Objects.isNull(documentEntity)) {
      return new Document();
    }
    documentEntity.setDocumentNumber(document.getDocumentNumber());
    documentEntity.setDocumentType(document.getDocumentType());
    update(documentEntity);
    Document document2 = new Document();
    document2.setId(documentEntity.id.toString());
    document2.setDocumentType(documentEntity.documentType);
    document2.setDocumentNumber(documentEntity.documentNumber);
    return document2;
  }

  @Override
  public Document deleteDocument(String id) {
    Optional<DocumentEntity> optional = findByIdOptional(new ObjectId(id));
    if(optional.isEmpty()) {
      return new Document();
    }
    DocumentEntity documentEntity = optional.get();
    delete(documentEntity);
    Document document = new Document();
    document.setId(documentEntity.id.toString());
    document.setDocumentType(documentEntity.documentType);
    document.setDocumentNumber(documentEntity.documentNumber);
    return document;
  }
}
