package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.factory.demography.RaceFactory;
import ac.za.cput.repository.demography.RaceRepository;
import ac.za.cput.repository.demography.impl.RaceRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceRepository repository;
    private Race race;

    private Race getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("B", "Black");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void a_create() {

        Race rc = this.repository.create(this.race);
        Assert.assertNotNull(rc);
        Assert.assertSame(rc, this.race);
    }

    @Test
    public void c_read() {

        Race savedRace = getSaved();
        Race read = this.repository.read(savedRace.getDescription());
        Assert.assertSame(read, savedRace);
    }

    @Test
    public void b_update() {

        String newRace = "C";
        Race raceUpdate = new Race.Builder().copy(getSaved()).raceId(newRace).build();
        this.repository.update(raceUpdate);
        Assert.assertSame(newRace, raceUpdate.getRaceId());
    }

    @Test
    public void e_delete() {

        Race savedRace = getSaved();
        this.repository.delete(savedRace.getRaceId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Race> races = this.repository.getAll();
        Assert.assertEquals(1, races.size());
    }
}