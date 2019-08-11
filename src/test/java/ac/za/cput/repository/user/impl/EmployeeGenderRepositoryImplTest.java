package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    private EmployeeGender getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender(getSaved().getEmployeeNumber(), "M");
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void a_create() {

        EmployeeGender empGender = this.repository.create(this.employeeGender);
        Assert.assertNotNull(empGender);
        Assert.assertSame(empGender, this.employeeGender);
    }

    @Test
    public void c_read() {

        EmployeeGender savedEmpGender = getSaved();
        EmployeeGender read = this.repository.read(savedEmpGender.getGenderId());
        Assert.assertSame(read, savedEmpGender);
    }

    @Test
    public void b_update() {

        String newEmpGender = "F";
        EmployeeGender employeeGenderUpdate = new EmployeeGender.Builder().copy(getSaved()).genderId(newEmpGender).build();
        this.repository.update(employeeGenderUpdate);
        Assert.assertSame(newEmpGender, employeeGenderUpdate.getGenderId());
    }

    @Test
    public void e_delete() {

        EmployeeGender savedEmpGender = getSaved();
        this.repository.delete(savedEmpGender.getGenderId());
        d_getAll();
    }

    @Test
    public void d_getAll() {

        Set<EmployeeGender> employeeGenders = this.repository.getAll();
        Assert.assertEquals(1, employeeGenders.size());
    }
}