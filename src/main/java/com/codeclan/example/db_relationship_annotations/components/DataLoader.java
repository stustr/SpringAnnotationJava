package com.codeclan.example.db_relationship_annotations.components;

import com.codeclan.example.db_relationship_annotations.models.Extension;
import com.codeclan.example.db_relationship_annotations.models.File;
import com.codeclan.example.db_relationship_annotations.models.Folder;
import com.codeclan.example.db_relationship_annotations.models.Person;
import com.codeclan.example.db_relationship_annotations.repositories.FileRepository;
import com.codeclan.example.db_relationship_annotations.repositories.FolderRepository;
import com.codeclan.example.db_relationship_annotations.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person struan = new Person("Struan");
        personRepository.save(struan);

        Folder folder = new Folder("myFolder", struan);
        folderRepository.save(folder);

        File file = new File("writing", Extension.TXT,
                100, folder);
        fileRepository.save(file);
//
//        struan.addFolder(folder);
//        folder.addFiles(file);
    }


}
