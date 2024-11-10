/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import database.DbConnection;
import model.Heritage;
import view.AdmRestaurant;
/**
 *
 * @author user
 */
public class HeritageController extends AdmRestaurant{
    DbConnection db;
    public int registerHeritage(Heritage detailher){
       String query;
       query = "insert into sanjin_heritage(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailher.getrID() + "','"+
       detailher.getrName() + "','"+
       detailher.getrLocation() + "','"+
       detailher.getrPhone() + "','"+
       detailher.getrEmail() + "','"+
       detailher.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }  
    
}
