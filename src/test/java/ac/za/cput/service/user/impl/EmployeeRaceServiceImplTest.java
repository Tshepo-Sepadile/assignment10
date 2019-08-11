package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.factory.user.EmployeeRaceFactory;
import ac.za.cput.repository.user.EmployeeRaceRepository;
import ac.za.cput.repository.user.impl.EmployeeRaceRepositoryImpl;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRaceServiceImplTest {

    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    private EmployeeRace getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.getEmployeeRace(getSaved().getEmployeeNumber(), "B");
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void a_create() {

        EmployeeRace empRace = this.repository.create(this.employeeRace);
        Assert.assertNotNull(empRace);
        Assert.assertSame(empRace, this.employeeRace);
    }

    @Test
    public void c_read() {

        EmployeeRace savedEmpRace = getSaved();
        EmployeeRace read = this.repository.read(savedEmpRace.getRaceId());
        Assert.assertSame(read, savedEmpRace);
    }

    @Test
    public void b_update() {

        String newEmpRace = "F";
        EmployeeRace employeeRaceUpdate = new EmployeeRace.Builder().copy(getSaved()).raceId(newEmpRace).build();
        this.repository.update(employeeRaceUpdate);
        Assert.assertSame(newEmpRace, employeeRaceUpdate.getRaceId());
    }

    @Test
    public void e_delete() {

        EmployeeRace savedEmpRace = getSaved();
        this.repository.delete(savedEmpRace.getRaceId());
        d_getAll();
    }

    @Test
    public void d_getAll() {

        Set<EmployeeRace> employeeRaces = this.repository.getAll();
        Assert.assertEquals(1, employeeRaces.size());
    }
}