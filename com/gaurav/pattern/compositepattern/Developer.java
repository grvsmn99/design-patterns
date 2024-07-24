package com.gaurav.pattern.compositepattern;

public class Developer implements Employee{

    private int id;
    private String name;
    private String position;

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
        this.position = "Developer";
    }


    @Override
    public void showEmployee() {
        System.out.println(id + " :  " + name + " : " + position);
    }
}
