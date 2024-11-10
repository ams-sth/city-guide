
package controller;
import database.DbConnection;
import model.Hotel;
import view.AdmRestaurant;

public class HotelController extends AdmRestaurant{
    DbConnection db;
    public int registerHotel(Hotel detailhot){
       String query;
       query = "insert into sanjin_hospital(rID,rName,rLocation,rPhone,rEmail,opentime)values('"+
       detailhot.getrID() + "','"+
       detailhot.getrName() + "','"+
       detailhot.getrLocation() + "','"+
       detailhot.getrPhone() + "','"+
       detailhot.getrEmail() + "','"+
       detailhot.getopenTime() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       
       }  
    
}
