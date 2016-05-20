package com.team.travel.travelteam.api.data.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user", schema = "public")
public class User implements Serializable{

    @Id
    @Column(name = "user_name", nullable = false, updatable = false)
    @NotNull
    @Size(max = 15)
    private String user;

    @Column(name = "user_password", nullable = false)
    @NotNull
    @Size(max = 50)
    private String password;

    @Column(name = "user_email", nullable = false)
    @NotNull
    @Size(max = 15)
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Position> positions;

    public User() {
    }

    public User(String user, String password, String email) {
        this.user = user;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
