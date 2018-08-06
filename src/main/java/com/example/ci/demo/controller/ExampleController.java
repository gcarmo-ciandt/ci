package com.example.ci.demo.controller;

import com.example.ci.demo.model.Example;
import com.example.ci.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@RequestMapping(value  = "/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping
    public Iterable<Example> get(){
        return exampleService.get();
    }

    @PostMapping
    public Example post(String name){
        return exampleService.post(name);
    }

}
