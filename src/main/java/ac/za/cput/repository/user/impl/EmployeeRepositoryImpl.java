package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private static Set<Employee> employees;

    private EmployeeRepositoryImpl()
    {
        this.employees = new HashSet<>();
    }

    public static EmployeeRepository getRepository()
    {
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee)
    {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee read(String employeeNumber)
    {
        this.employees.contains(employeeNumber);
        return null;
    }

    public Employee update(Employee employee)
    {
        if(employees == employee)
        {
            this.employees.add(employee);
        }
        return employee;
    }

    public void delete(String employeeNumber)
    {
        this.employees.remove(employeeNumber);
    }

    public Set<Employee>getAll()
    {
        return this.employees;
    }
}
