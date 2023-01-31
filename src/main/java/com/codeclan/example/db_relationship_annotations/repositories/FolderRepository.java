package com.codeclan.example.db_relationship_annotations.repositories;

import com.codeclan.example.db_relationship_annotations.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
