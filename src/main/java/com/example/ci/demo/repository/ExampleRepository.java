package com.example.ci.demo.repository;

import com.example.ci.demo.model.Example;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ExampleRepository extends CrudRepository<Example, UUID> {
}
