
import controller.HotelController;
import model.Hotel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHotel {
    Hotel hotel;
    HotelController hotelController;
    @Before
    public void init() {
        hotel = new Hotel();
        hotelController = new HotelController();
    }
    @Test
    public void testRegisterHotel() {
        hotel = new Hotel(1,"bisco"," ktm ","9875565654","bisco@gmail.com","6 PM-1 AM");
        int actualResult = hotelController.registerHotel(hotel);
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
    }
    @After
    public void tearDown() {
        hotel = null;
        hotelController = null;
    }
}

