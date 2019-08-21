package com.s.m.shahi.multipleitemrecyclerviewdemo;

public class Contacts {
    private String name;
    private String number;

    public Contacts() {
    }

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
