package lk.Ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.Ijse.embed.FullName;

//@Entity(name = "k") meken aluth table ekaka hadenva
@Entity
//@Table(name = "l") mekenuth puluvn
public class Student {
    @Id
    private int id;

    private FullName name;

    private  String address;

    public Student(){

    }

    public Student(int id,String address ,FullName name) {
        this.address = address;
        this.id = id;
        this.name=name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
