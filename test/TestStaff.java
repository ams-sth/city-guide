
import controller.StaffController;
import model.Staff;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author user
 */
public class TestStaff {

   Staff staff;
StaffController staffController;

@Before
public void init(){
staff = new Staff();
staffController = new StaffController();
}

@Test
public void testRegisterCustomer(){
staff = new Staff("Kiran","Rana",'M',"13343","KTM","kirawdswe","kiranwew23","132442","45");
int actualResult = staffController.registerStaff(staff);
int expectedResult = 1;

Assert.assertEquals(actualResult,expectedResult);
}

@After
public void tearDown(){
staff = null;
staffController = null;
}
}
