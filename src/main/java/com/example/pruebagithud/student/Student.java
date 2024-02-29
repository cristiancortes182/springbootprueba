package com.example.pruebagithud.student;

import java.time.LocalDate;

public class Student {

    private String firstname;
    private String lastname;
    private LocalDate data;

    private String email;

    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstname, String lastname, LocalDate data, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.data = data;
        this.email = email;
        this.age = age;
    }

    public Student() {
    }
}
