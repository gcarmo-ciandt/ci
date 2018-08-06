package com.example.ci.demo.service;

import com.example.ci.demo.model.Example;
import com.example.ci.demo.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.UUID;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public Iterable<Example> get(){
        return exampleRepository.findAll();
    }

    public Example post(String name){

        Example example = new Example(UUID.randomUUID(), name);
        return exampleRepository.save(example);

    }

}
