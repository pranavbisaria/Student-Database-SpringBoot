package com.pranav.crudapi.Studentmodel;
import jakarta.persistence.*;
@Entity
@Table(name = "Student")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long universityRoll;
    @Column(name = "Name")
    private String name;
    @Column(name = "Year")
    private int year;
    @Column(name = "Branch")
    private String branch;
    @Column(name = "Age")
    private int age;

    public void setUniversityRoll(long universityRoll) {
        this.universityRoll = universityRoll;
    }
    public long getUniversityRoll() {
        return universityRoll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
}
