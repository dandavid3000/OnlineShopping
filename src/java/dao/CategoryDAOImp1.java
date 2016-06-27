/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author Dan
 */
public class CategoryDAOImp1 implements CategoryDAO{

    @Override
    public ArrayList<Category> getListParentCategory() {
        Connection connection = DBConnect.getConnection();
        String sql="select * from category where category_Parent='null'";
        ArrayList<Category> arr = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Category ds = new Category();
                ds.setCategory_ID(rs.getString("category_ID"));
                ds.setCategory_Name(rs.getString("category_Name"));
                ds.setCategory_Parent(rs.getString("category_Parent"));
                arr.add(ds);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAOImp1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
    
    
}
