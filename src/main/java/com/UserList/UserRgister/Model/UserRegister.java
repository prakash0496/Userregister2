package com.UserList.UserRgister.Model;


import javax.persistence.*;

@Entity
@Table(name="userregister")
public class UserRegister {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="userid")
    private int Userid;
    @Column(name="firstname")
    private String Firstname;
    @Column(name="lastname")
    private String Lastname;
    @Column(name="city")
    private String City;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }
}
