package com.kln.swst.simplerest.model;

public class Student {
    private long id;
    private String name;
    private String address;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws IllegalArgumentException{
        if ( age > 100 || age <= 0){
            throw new IllegalArgumentException("Invalid age");
        }

        this.age = age;
    }
}
