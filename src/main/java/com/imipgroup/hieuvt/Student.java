package com.imipgroup.hieuvt;

/**
 * Created by hieuvt on 9/30/2014.
 */
public class Student {
    private String name = "Hieu";

    public Student(){

    }

    public  Student(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
