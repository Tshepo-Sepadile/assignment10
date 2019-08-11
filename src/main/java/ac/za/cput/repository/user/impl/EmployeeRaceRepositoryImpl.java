package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {

    private static EmployeeRaceRepository employeeRaceRepository = null;
    private Set<EmployeeRace> employeeRaces;

    private EmployeeRaceRepositoryImpl()
    {
        this.employeeRaces = new HashSet<>();
    }

    public static EmployeeRaceRepository getRepository()
    {
        if(employeeRaceRepository == null) employeeRaceRepository = new EmployeeRaceRepositoryImpl();
        return employeeRaceRepository;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace)
    {
        this.employeeRaces.add(employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace read(String employeeNumber)
    {
        this.employeeRaces.contains(employeeNumber);
        return null;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace)
    {
        if(employeeRaces == employeeRace)
        {
            this.employeeRaces.add(employeeRace);
        }
        return employeeRace;
    }

    public void delete(String raceId)
    {
        this.employeeRaces.remove(raceId);
    }

    public Set<EmployeeRace>getAll()
    {
        return this.employeeRaces;
    }
}
