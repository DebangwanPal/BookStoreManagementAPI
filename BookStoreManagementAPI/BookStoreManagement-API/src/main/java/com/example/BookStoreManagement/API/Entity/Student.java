package com.example.BookStoreManagement.API.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {

    public Student(){}

    public  Student(String name, String stream, int roll) {
        this.name = name;
        this.stream = stream;
        this.roll = roll;
    }
    
    @Id //to mention this is primary key
    @GeneratedValue//to automatically create the primary key
    @Column(name="REGNO")   //attribute name
    private long regNo;

    @Column(name="NAME")
    private String name;

    @Column(name="STREAM")
    private String stream;

    @Column(name="ROLL")
    private int roll;

    public long getRegNo() {
        return regNo;
    }

    public void setRegNo(long regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {      //for debugging purposes
        return "Student [name=" + name + ", regNo=" + regNo + ", roll=" + roll + ", stream=" + stream + "]";
    }

}
