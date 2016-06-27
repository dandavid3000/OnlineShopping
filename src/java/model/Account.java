/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Dan
 */
public class Account {
    private String account_ID;
    private String account_Name;
    private String name;
    private int permission;
    private String address;
    private String phone;
    private Date dob;
    private boolean gender;
    private boolean status;

    public Account() {
    }

    public Account(String account_ID, String account_Name, String name, int permission, String address, String phone, Date dob, boolean gender, boolean status) {
        this.account_ID = account_ID;
        this.account_Name = account_Name;
        this.name = name;
        this.permission = permission;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
        this.gender = gender;
        this.status = status;
    }

    public String getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(String account_ID) {
        this.account_ID = account_ID;
    }

    public String getAccount_Name() {
        return account_Name;
    }

    public void setAccount_Name(String account_Name) {
        this.account_Name = account_Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
            
    
}
