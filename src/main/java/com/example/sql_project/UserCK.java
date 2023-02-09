package com.example.sql_project;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

//Only used to make composite key by both idclass && embaded method(with minor changes)
@Embeddable
public class UserCK implements Serializable {//implemented with serilize to make composite keys

    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String name;

    UserCK(){

    }                              //very important to add default cons
                                  // ,args cons,getters,
                                  //equals ,hashcode (alt+insert)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserCK userCK)) return false;
        return id == userCK.id && name.equals(userCK.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public UserCK(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
