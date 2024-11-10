
import controller.NightlifeController;
import model.Nightlife;
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
public class TestNightlife {

    Nightlife nightlife;
    NightlifeController nightlifeController;

    @Before
    public void init() {
        nightlife = new Nightlife();
        nightlifeController = new NightlifeController();
    }

    @Test
    public void testRegisterNightlife() {
        nightlife = new Nightlife(4,"bisco"," ktm ","9834565654","biscose@gmail.com","6 PM-1 AM");
        int actualResult = nightlifeController.registerNightlife(nightlife);
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @After
    public void tearDown() {
        nightlife = null;
        nightlifeController = null;
    }
}

