/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dan
 */
public class Detail {
    private String detail_ID;
    private Bill bill;
    private Product product;
    private int quanlity;
    private int price;
    private int discount;

    public Detail() {
    }

    public Detail(String detail_ID, Bill bill, Product product, int quanlity, int price, int discount) {
        this.detail_ID = detail_ID;
        this.bill = bill;
        this.product = product;
        this.quanlity = quanlity;
        this.price = price;
        this.discount = discount;
    }

    public String getDetail_ID() {
        return detail_ID;
    }

    public void setDetail_ID(String detail_ID) {
        this.detail_ID = detail_ID;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}
