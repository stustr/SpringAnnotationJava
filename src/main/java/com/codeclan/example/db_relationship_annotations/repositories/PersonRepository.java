package com.codeclan.example.db_relationship_annotations.repositories;

import com.codeclan.example.db_relationship_annotations.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
