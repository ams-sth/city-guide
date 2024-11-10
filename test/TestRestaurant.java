
import controller.NightlifeController;
import controller.RestaurantController;
import model.Nightlife;
import model.Restaurant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestRestaurant {
    Restaurant restaurant;
    RestaurantController restaurantController;
    Nightlife nightlife;
    NightlifeController nightlifeController;
    @Before
    public void init() {
        restaurant = new Restaurant();
        restaurantController = new RestaurantController();
        nightlife = new Nightlife();
        nightlifeController = new NightlifeController();
    }
    @Test
    public void testRegisterRestaurant() {
        restaurant = new Restaurant(16,"Hity Cafe"," Paknajol Marg, Kathmandu ","9844085","shresthfah@gmail.com","11:00 AM -10:00PM");
        int actualResult = restaurantController.registerRestaurant(restaurant);
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testRegisterNightlife() {
        nightlife = new Nightlife(8,"bisco"," ktm ","9755652234","biscosao@gmail.com","6 PM-1 AM");
        int actualResult = nightlifeController.registerNightlife(nightlife);
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult);
    }    
    @After
    public void tearDown() {
        restaurant = null;
        restaurantController = null;
        nightlife = null;
        nightlifeController = null;
    }
}

