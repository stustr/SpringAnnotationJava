package com.codeclan.example.db_relationship_annotations.controllers;

import com.codeclan.example.db_relationship_annotations.models.Folder;
import com.codeclan.example.db_relationship_annotations.models.Person;
import com.codeclan.example.db_relationship_annotations.repositories.FolderRepository;
import com.codeclan.example.db_relationship_annotations.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolers() {
        return new ResponseEntity<>(folderRepository.findAll(),
                HttpStatus.OK);
    }
}
