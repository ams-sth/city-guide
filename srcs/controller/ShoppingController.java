
package controller;
import database.DbConnection;
import model.Shopping;
import view.AdmRestaurant;

public class ShoppingController extends AdmRestaurant {
    DbConnection db;
    public int registerShopping(Shopping detailsho){
       String query;
       query = "insert into sanjin_shopping(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailsho.getrID() + "','"+
       detailsho.getrName() + "','"+
       detailsho.getrLocation() + "','"+
       detailsho.getrPhone() + "','"+
       detailsho.getrEmail() + "','"+
       detailsho.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }   
    
}

   
       
       
       
    

