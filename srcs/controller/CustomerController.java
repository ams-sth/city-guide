package controller;

import java.sql.ResultSet;

import database.DbConnection;
import model.Customer;

public class CustomerController {
    
    DbConnection db;

    public int registerCustomer(Customer customer){
       String query;
       query = "insert into customer(FirstName,LastName,Gender,PhoneNo,Address,Username,Email,Password,DOB)values('"+
       customer.getFirstName() + "','"+
       customer.getLastName() + "','"+
       customer.getGender() + "','"+
       customer.getPhoneNo() + "','"+
       customer.getAddress() +"','" +
       customer.getUsername() +"','" +
       customer.getEmail() +"','" +
       customer.getPassword() +"','" +
       customer.getDob() + "');";
       
       db = new DbConnection();
       return db.manipulate(query);
       
       }

       public Customer loginCustomer(String username,String password){
        String query;
        query="select * from customer where username='"+username+"' and password='"+password+"';";
        db=new DbConnection();
        ResultSet rs=db.retrieve(query);
        Customer customer=null;
        try{
            while(rs.next()){
            customer = new Customer();
            customer.setCustId(rs.getInt("custId"));
            customer.setFirstName(rs.getString("FirstName"));
            customer.setLastName(rs.getString("LastName"));
            customer.setGender(rs.getString("Gender").charAt(0));
            customer.setAddress(rs.getString("Address"));
            customer.setUsername(rs.getString("Username"));
            customer.setEmail("Email");
            customer.setPassword("Password");
            
            }
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
        return customer;
        }
       
    
}
