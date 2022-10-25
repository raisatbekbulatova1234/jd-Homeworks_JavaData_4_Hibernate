package com.example.jdhomeworks_javadata_4_hibernate.service;



import com.example.jdhomeworks_javadata_4_hibernate.entity.Person;
import com.example.jdhomeworks_javadata_4_hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}