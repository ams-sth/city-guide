
import controller.HeritageController;
import model.Heritage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHeritage {

    Heritage heritage;
    HeritageController heritageController;

    @Before
    public void init() {
        heritage = new Heritage();
        heritageController = new HeritageController();
    }

    @Test
    public void testHeritagesite() {
        heritage = new Heritage(5,"ChanguNarayan"," Bhaktapur ","124","changu@gmail.com","4:00 AM -10:00PM");
        int actualResult = heritageController.registerHeritage(heritage);
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @After
    public void tearDown() {
        heritage = null;
        heritageController = null;
    }
}
