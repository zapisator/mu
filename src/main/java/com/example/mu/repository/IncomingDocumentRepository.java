package com.example.mu.repository;

import com.example.mu.model.IncomingDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "incoming-documents", path = "incoming-documents")
public interface IncomingDocumentRepository extends JpaRepository<IncomingDocument, Long> {

}