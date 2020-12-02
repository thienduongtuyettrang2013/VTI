package com.vti.entity;

public abstract class Candidate {
    private int id;
    private String FullName;
    private String Phone;
    private String Email;
    private String Password;
    private String role;

    public Candidate(int id, String fullName, String phone, String email, String password, String role) {
        this.id = id;
        FullName = fullName;
        Phone = phone;
        Email = email;
        Password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "com.vti.entity.Candidate{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", Phone=" + Phone +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", role=" + role +
                '}';
    }
}

