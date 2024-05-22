package com.spring.ERMProject.ERM.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;

    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public Employee(int id,String name,int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
