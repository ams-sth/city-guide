
import controller.ShoppingController;
import model.Shopping;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HawkZ
 */
public class TestShopping {

    Shopping shopping;
    ShoppingController shoppingController;

    @Before
    public void init() {
        shopping = new Shopping();
        shoppingController = new ShoppingController();
    }

    @Test
    public void testRegisterRestaurant() {
        shopping = new Shopping(2,"Bhatbhateni"," RadheRadhe ","98755654","bhatbhateni@gmail.com","6 AM-11 PM");
        int actualResult = shoppingController.registerShopping(shopping);
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @After
    public void tearDown() {
        shopping = null;
        shoppingController = null;
    }
}

