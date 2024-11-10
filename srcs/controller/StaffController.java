package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.Staff;

public class StaffController {
    
    DbConnection db;

    public int registerStaff(Staff staff){
       String query;
       query = "insert into staff(FirstName,LastName,Gender,PhoneNo,Address,Username,Email,Password,DOB)values('"+
       staff.getFirstName() + "','"+
       staff.getLastName() + "','"+
       staff.getGender() + "','"+
       staff.getPhoneNo() + "','"+
       staff.getAddress() +"','" +
       staff.getUsername() +"','" +
       staff.getEmail() +"','" +
       staff.getPassword() +"','" +
       staff.getDob() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       }

       public Staff loginStaff(String username,String password){
        String query;
        query="select * from staff where Username='"+username+"' and Password='"+password+"';";
        db=new DbConnection();
        ResultSet rs=db.retrieve(query);
        Staff staff=null;
        try{
            while(rs.next()){
            staff = new Staff();
            staff.setStafftId(rs.getInt("staffId"));
            staff.setFirstName(rs.getString("FirstName"));
            staff.setLastName(rs.getString("LastName"));
            staff.setGender(rs.getString("Gender").charAt(0));
            staff.setAddress(rs.getString("Address"));
            staff.setUsername(rs.getString("Username"));
    
            
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
        return staff;
        }
       
    
}
