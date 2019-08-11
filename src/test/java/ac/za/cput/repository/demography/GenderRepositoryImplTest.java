package ac.za.cput.repository.demography;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.repository.demography.impl.GenderRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepository repository;
    private Gender gender;

    private Gender getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("M", "Male");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void a_create() {

        Gender gend = this.repository.create(this.gender);
        Assert.assertNotNull(gend);
        Assert.assertSame(gend, this.gender);
    }

    @Test
    public void c_read() {

        Gender savedGender = getSaved();
        Gender read = this.repository.read(savedGender.getDescription());
        Assert.assertSame(read, savedGender);
    }

    @Test
    public void b_update() {

        String newGenderId = "F";
        Gender genderUpdate = new Gender.Builder().copy(getSaved()).genderId(newGenderId).build();
        this.repository.update(genderUpdate);
        Assert.assertSame(newGenderId, genderUpdate.getGenderId());
    }

    @Test
    public void e_delete() {

        Gender savedGend = getSaved();
        this.repository.delete(savedGend.getGenderId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Gender> genders = this.repository.getAll();
        Assert.assertEquals(1, genders.size());
    }
}