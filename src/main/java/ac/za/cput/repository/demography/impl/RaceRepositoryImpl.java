package ac.za.cput.repository.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository;
    private static Set<Race> races;

    private RaceRepositoryImpl()
    {
        this.races = new HashSet<>();
    }

    public static RaceRepository getRepository()
    {
        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }

    public Race create(Race race)
    {
        this.races.add(race);
        return race;
    }

    public Race read(String race)
    {
        this.races.contains(race);
        return null;
    }

    public Race update(Race race)
    {
        if(races == race)
        {
            this.races.add(race);
        }
        return race;
    }

    public void delete(String race)
    {
        this.races.remove(race);
    }

    public Set<Race>getAll()
    {
        return this.races;
    }
}
