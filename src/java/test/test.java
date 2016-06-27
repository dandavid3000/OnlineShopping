/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.CategoryDAOImp1;

/**
 *
 * @author Dan
 */
public class test{
    public static void main(String[] args)
    {
        CategoryDAOImp1 ds = new CategoryDAOImp1();
        
        for(int i=0;i<ds.getListParentCategory().size();i++)
        {
            System.out.println(ds.getListParentCategory().get(i).getCategory_Name());
        }
        
    }
}
