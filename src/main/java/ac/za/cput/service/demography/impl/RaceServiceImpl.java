package ac.za.cput.service.demography.impl;

import ac.za.cput.domain.demography.Race;
import ac.za.cput.repository.demography.RaceRepository;
import ac.za.cput.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository = null;

    @Override
    public Race create(Race race)
    {
        return this.raceRepository.create(race);
    }

    @Override
    public Race update(Race race)
    {
        return this.raceRepository.update(race);
    }

    @Override
    public void delete(String s)
    {
        raceRepository.delete(s);
    }

    @Override
    public Race read(String s)
    {
        return this.raceRepository.read(s);
    }


    @Override
    public Set<Race> getAll()
    {
        return raceRepository.getAll();
    }
}
