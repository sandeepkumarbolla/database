package com.student.database.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int studId;
    private String name;
    private int age;

    public Student(int studId, String name, int age) {
        this.studId = studId;
        this.name = name;
        this.age = age;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
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

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }
}
