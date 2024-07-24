package com.gaurav.pattern.compositepattern;

public class Manager implements Employee{

    private int id;
    private String name;
    private String position;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
        this.position = "Manager";
    }

    @Override
    public void showEmployee() {
        System.out.println(id + " :  " + name + " : " + position);
    }
}
