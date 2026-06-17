package com.company.mdoc.repository;

import com.company.mdoc.entity.Document;
import io.jmix.core.repository.JmixDataRepository;

import java.util.UUID;

public interface DocumentRepository extends JmixDataRepository<Document, UUID> {
}