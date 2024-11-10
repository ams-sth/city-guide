
import controller.HospitalController;
import model.Hospital;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHospital {
    Hospital hospital;
    HospitalController hospitalController;

    @Before
    public void init() {
        hospital = new Hospital();
        hospitalController = new HospitalController();
    }
    @Test
    public void testRegisterHospital() {
        hospital = new Hospital(5,"KMC"," Bhaktapur ","987654234","kmcclz@gmail.com","All Time");
        int actualResult = hospitalController.registerHospital(hospital);
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);      
    }
    @After
    public void tearDown() {
        hospital = null;
        hospitalController = null;
    }
}

