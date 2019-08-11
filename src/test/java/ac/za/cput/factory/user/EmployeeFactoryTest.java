package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee("Tshepo", "Sepadile");
        Assert.assertNotNull(employee);
    }
}