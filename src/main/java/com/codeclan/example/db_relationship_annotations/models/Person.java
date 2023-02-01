package com.codeclan.example.db_relationship_annotations.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "people")
public class Person {

    @Column(name = "name")
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<Folder> folders;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Person(String name) {

        this.name = name;
        this.folders = new ArrayList<>();
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getFolders() {
        return folders;
    }

    public void setFolders(List folders) {
        this.folders = folders;
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }
}
