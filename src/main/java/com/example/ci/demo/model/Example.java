package com.example.ci.demo.model;

import java.io.Serializable;
import java.util.UUID;

public class Example implements Serializable {

    public Example(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
