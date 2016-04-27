package com.team.travel.travelteam.api.data.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @Column(name = "user_name", nullable = false, updatable = false)
    @NotNull
    @Size(max = 15)
    private String user;

    @Column(name = "user_password", nullable = false)
    @NotNull
    @Size(max = 50)
    private String password;

    public User() {
    }

    @JsonCreator
    public User(@JsonProperty("user") String user, @JsonProperty("password") String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
