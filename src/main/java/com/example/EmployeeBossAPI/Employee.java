package com.example.EmployeeBossAPI;

public class Employee {
    private String name;
    private int rating;
    private int age;
    private int yoe;

    public Employee() {
        this.name = name;
        this.rating = rating;
        this.age = age;
        this.yoe = yoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }
}
