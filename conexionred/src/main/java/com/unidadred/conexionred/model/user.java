package com.unidadred.conexionred.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String passWord;
    private String role;

    public user(String username, String password, String role) {
        this.userName = username;
        this.passWord = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getpassWord() {
        return passWord;
    }

    public String getuserName() {
        return userName;
    }

    public String getrole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setrole(String role) {
        this.role = role;
    }
}
