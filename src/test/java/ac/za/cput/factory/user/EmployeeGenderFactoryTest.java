package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void getEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender("12345", "M");
        Assert.assertNotNull(employeeGender);
    }
}