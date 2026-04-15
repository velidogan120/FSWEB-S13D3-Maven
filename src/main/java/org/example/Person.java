package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNumber;
    boolean isEmployed;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName,String lastName,int age,String email, String phoneNumber,boolean isEmployed) {
        this(firstName,lastName,age);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmployed = isEmployed;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        if(age <= 19 && age >= 13){
            return true;
        }
        return false;
    }
}
