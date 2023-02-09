package com.example.sql_project;

import jakarta.persistence.*;

@Entity
@Table(name="User_Table")
//@IdClass(UserCK.class)-->using @idclass method
public class User {

    //Id
    //private int id;
    //@Id                  using idclass method(primary) key
    //private String name;
    @EmbeddedId //-->for making composite primary key with embaded method
    private UserCK userCK;
    private String country;

    User(){

    }

    public User(UserCK userCK, String country) {
        this.userCK = userCK;
        this.country = country;
    }

    public UserCK getUserCK() {
        return userCK;
    }

    public void setUserCK(UserCK userCK) {
        this.userCK = userCK;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
