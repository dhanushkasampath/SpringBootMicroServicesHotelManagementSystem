package com.hotel.staffmicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StaffMember {

    @Id
    String id;
    String firstName;
    String lastName;
    String nic;
    String gender;
    int age;

    public StaffMember() {

    }

    public StaffMember(String firstName, String lastName, String nic, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {//here is how we achieve encapsulation
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StaffMember created successfully{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nic='" + nic + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
