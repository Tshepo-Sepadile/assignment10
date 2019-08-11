package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private EmployeeGenderRepository employeeGenderRepository = null;

    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        return this.employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        return this.employeeGenderRepository.update(employeeGender);
    }

    @Override
    public void delete(String s)
    {
        employeeGenderRepository.delete(s);
    }

    @Override
    public EmployeeGender read(String s)
    {
        return this.employeeGenderRepository.read(s);
    }


    @Override
    public Set<EmployeeGender> getAll()
    {
        return employeeGenderRepository.getAll();
    }
}
