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
public class Category {
    private String category_ID;
    private String category_Name;
    private String category_Parent;

    public Category() {
    }

    public Category(String category_ID, String category_Name, String category_Parent) {
        this.category_ID = category_ID;
        this.category_Name = category_Name;
        this.category_Parent = category_Parent;
    }

    public String getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(String category_ID) {
        this.category_ID = category_ID;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public String getCategory_Parent() {
        return category_Parent;
    }

    public void setCategory_Parent(String category_Parent) {
        this.category_Parent = category_Parent;
    }
    
    
}
