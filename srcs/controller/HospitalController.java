
package controller;
import database.DbConnection;
import model.Hospital;
import view.AdmRestaurant;

public class HospitalController extends AdmRestaurant{
    DbConnection db;
    public int registerHospital(Hospital detailhos){
       String query;
       query = "insert into sanjin_hospital(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailhos.getrID() + "','"+
       detailhos.getrName() + "','"+
       detailhos.getrLocation() + "','"+
       detailhos.getrPhone() + "','"+
       detailhos.getrEmail() + "','"+
       detailhos.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }  
    
}
