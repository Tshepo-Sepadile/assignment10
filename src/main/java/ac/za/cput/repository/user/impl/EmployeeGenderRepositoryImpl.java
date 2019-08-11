package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepository employeeGenderRepository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl()
    {
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepository getRepository()
    {
        if(employeeGenderRepository == null) employeeGenderRepository = new EmployeeGenderRepositoryImpl();
        return employeeGenderRepository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        this.employeeGenders.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String employeeNumber)
    {
        this.employeeGenders.contains(employeeNumber);
        return null;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        if(employeeGenders == employeeGender)
        {
            this.employeeGenders.add(employeeGender);
        }
        return employeeGender;
    }

    public void delete(String genderId)
    {
        this.employeeGenders.remove(genderId);
    }

    public Set<EmployeeGender>getAll()
    {
        return this.employeeGenders;
    }
}
