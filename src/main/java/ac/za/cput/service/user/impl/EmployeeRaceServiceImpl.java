package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;
import ac.za.cput.service.user.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private EmployeeRaceRepository employeeRaceRepository = null;

    @Override
    public EmployeeRace create(EmployeeRace employeeRace)
    {
        return this.employeeRaceRepository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace)
    {
        return this.employeeRaceRepository.update(employeeRace);
    }

    @Override
    public void delete(String s)
    {
        employeeRaceRepository.delete(s);
    }

    @Override
    public EmployeeRace read(String s)
    {
        return this.employeeRaceRepository.read(s);
    }


    @Override
    public Set<EmployeeRace> getAll()
    {
        return employeeRaceRepository.getAll();
    }
}
