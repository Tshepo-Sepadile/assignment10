package ac.za.cput.factory.demography;

import ac.za.cput.domain.demography.Race;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRace() {

        Race race = RaceFactory.getRace("B", "Black");
        Assert.assertNotNull(race);
    }
}