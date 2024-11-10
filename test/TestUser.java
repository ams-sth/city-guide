import model.Customer;
import controller.CustomerController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestUser {
Customer customer;
CustomerController customerController;
@Before
public void init(){
customer = new Customer();
customerController = new CustomerController();
}
@Test
public void testRegisterCustomer(){
customer = new Customer("Kiran","Rana",'M',"94644343","KTM","kuiiwe","kq2fs23","1wr42","45");
int actualResult = customerController.registerCustomer(customer);
int expectedResult = 1;
Assert.assertEquals(actualResult,expectedResult);
}
@Test
public void testLoginCustomer(){
    String us = "sanjin";
    String pw = "thapa";
    Customer actualResult = customerController.loginCustomer(us,pw);
    int expectedResult = 1;
    Assert.assertEquals(actualResult,expectedResult);
}
@After
public void tearDown(){
customer = null;
customerController = null;
}}
