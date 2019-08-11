package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    @Test
    public void getEmployeeRace() {

        EmployeeRace employeeRace = EmployeeRaceFactory.getEmployeeRace("12345", "B");
        Assert.assertNotNull(employeeRace);
    }
}