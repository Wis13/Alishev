package com.vadym.reflextion;

@Author(name = "Vadym", dateOfCreation = 2020)

public class Person {
    private int id;
    private String name;

    public Person(){
        this.id = -1;
        this.name = "noname";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Person with id " + id + " and name " + name + "says Hello");
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
