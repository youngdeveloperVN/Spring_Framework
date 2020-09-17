package com.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
