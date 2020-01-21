package com.company;

public class Employee {
    String firstName;
    String lastName;
    Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInfo(){
        String result = "My name is " + firstName + " " + lastName;

        return result;
    }

    public void work(int hour){
        System.out.println("I'm gonna work for " + hour + " hours!");
    }
}
