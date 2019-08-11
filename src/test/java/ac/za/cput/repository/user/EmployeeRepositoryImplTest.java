package ac.za.cput.repository.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;
    private Employee employee;

    private Employee getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Jordin", "Sparks");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void a_create() {

        /*Employee employee = EmployeeFactory.getEmployee("Tshepo", "Sepadile");
        repository.create(employee);
        Employee employee2 = EmployeeFactory.getEmployee("Seupa", "Tee");
        repository.create(employee2);
        Assert.assertEquals(2, repository.getAll().size());*/
        Employee emp = this.repository.create(this.employee);
        Assert.assertNotNull(emp);
        Assert.assertSame(emp, this.employee);
    }

    @Test
    public void c_read() {

        /*Employee employee = EmployeeFactory.getEmployee("Tshepo", "Sepadile");
        employee = repository.create(employee);
        Assert.assertNotNull(employee);*/
        Employee savedEmp = getSaved();
        Employee read = this.repository.read(savedEmp.employeeNumber());
        Assert.assertSame(read, savedEmp);
    }

    @Test
    public void b_update() {

        /*String name = "King";
        Employee employee = EmployeeFactory.getEmployee(name, "Sepadile");
        employee = repository.update(employee);
        Assert.assertEquals("Tshepo", employee.firstName());*/
        String name = "Tshepo";
        Employee employeeUpdate = new Employee.Builder().copy(getSaved()).firstName(name).build();
        this.repository.update(employeeUpdate);
        Assert.assertSame(name, employeeUpdate.firstName());
    }

    @Test
    public void e_delete() {

        Employee savedEmp = getSaved();
        this.repository.delete(savedEmp.employeeNumber());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Employee> employees = this.repository.getAll();
        Assert.assertEquals(1, employees.size());
    }
}