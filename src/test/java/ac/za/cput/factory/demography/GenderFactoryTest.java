package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Gender;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getGender() {

        Gender gender = GenderFactory.getGender("M", "Male");
        Assert.assertNotNull(gender);
    }
}