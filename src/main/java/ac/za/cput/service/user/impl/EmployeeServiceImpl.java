package ac.za.cput.service.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository = null;

    @Override
    public Employee create(Employee employee)
    {
        return this.employeeRepository.create(employee);
    }

    @Override
    public Employee update(Employee employee)
    {
        return this.employeeRepository.update(employee);
    }

    @Override
    public void delete(String s)
    {
        employeeRepository.delete(s);
    }

    @Override
    public Employee read(String s)
    {
        return this.employeeRepository.read(s);
    }


    @Override
    public Set<Employee> getAll()
    {
        return employeeRepository.getAll();
    }
}
