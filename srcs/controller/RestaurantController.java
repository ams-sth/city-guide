
package controller;
import database.DbConnection;
import model.Restaurant;
import view.AdmRestaurant;

public class RestaurantController extends AdmRestaurant {
    DbConnection db;
    public int registerRestaurant(Restaurant detailres){
       String query;
       query = "insert into sanjin_restaurant(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailres.getrID() + "','"+
       detailres.getrName() + "','"+
       detailres.getrLocation() + "','"+
       detailres.getrPhone() + "','"+
       detailres.getrEmail() + "','"+
       detailres.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }   
    
}

   
       
       
       
    

