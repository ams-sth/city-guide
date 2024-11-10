
package controller;
import database.DbConnection;
import model.Nightlife;
import view.AdmRestaurant;

public class NightlifeController extends AdmRestaurant{
    DbConnection db;
    public int registerNightlife(Nightlife detailnig){
       String query;
       query = "insert into sanjin_nightlife(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailnig.getrID() + "','"+
       detailnig.getrName() + "','"+
       detailnig.getrLocation() + "','"+
       detailnig.getrPhone() + "','"+
       detailnig.getrEmail() + "','"+
       detailnig.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }  
    
}
