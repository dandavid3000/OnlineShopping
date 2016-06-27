/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Dan
 */
public class Bill {
    private String bill_ID;
    private Account account;
    private String shipping_address;
    private String payment;
    private Timestamp deliver_Day;
    private Timestamp purchase_Day;
    private String bill_status;

    public String getBill_status() {
        return bill_status;
    }

    public void setBill_status(String bill_status) {
        this.bill_status = bill_status;
    }

    public Bill() {
    }

    public Bill(String bill_ID, Account account, String shipping_address, String payment, Timestamp deliver_Day, Timestamp purchase_Day, String bill_Status) {
        this.bill_ID = bill_ID;
        this.account = account;
        this.shipping_address = shipping_address;
        this.payment = payment;
        this.deliver_Day = deliver_Day;
        this.purchase_Day = purchase_Day;
        this.bill_status = bill_Status;
    }

    public String getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(String bill_ID) {
        this.bill_ID = bill_ID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Timestamp getDeliver_Day() {
        return deliver_Day;
    }

    public void setDeliver_Day(Timestamp deliver_Day) {
        this.deliver_Day = deliver_Day;
    }

    public Timestamp getPurchase_Day() {
        return purchase_Day;
    }

    public void setPurchase_Day(Timestamp purchase_Day) {
        this.purchase_Day = purchase_Day;
    }
    
    
}
