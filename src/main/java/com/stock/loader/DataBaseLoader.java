package com.stock.loader;

import com.stock.dto.Person;
import com.stock.dto.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public DataBaseLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.personRepository.save(new Person("rahul" , "Kadam" , "Engineer"));
    }
}
