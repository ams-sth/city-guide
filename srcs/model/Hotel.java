package model;

public class Hotel {
    private int rID;
    private String rName,rLocation,rPhone,rEmail, openTime;
    
    public Hotel(int rID,String rName,String rLocation,String rPhone,String rEmail, String openTime)
    {
        this.rID = rID;
        this.rName = rName;
        this.rLocation = rLocation;
        this.rPhone = rPhone;
        this.rEmail = rEmail;
        this.openTime = openTime;
    } 
    public Hotel(){
    };
    public int getrID(){
        return rID;
    }
    public String getrName(){
        return rName;
    }
    public String getrLocation(){
        return rLocation;
    }
    public String getrPhone(){
        return rPhone;
    }
    public String getrEmail(){
        return rEmail;
    }
    public String getopenTime(){
        return openTime;
    }
    
}
