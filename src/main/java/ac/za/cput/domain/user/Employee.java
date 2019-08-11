package ac.za.cput.domain.user;

public class Employee {

    private String employeeNumber, firstName, lastName;

    private Employee(){}

    public Employee(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String employeeNumber()
    {
        return employeeNumber;
    }

    public String firstName()
    {
        return firstName;
    }

    public String lastName()
    {
        return lastName;
    }

    public static class Builder{
        private String employeeNumber, firstName, lastName;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

        public Builder copy(Employee employee)
        {
            this.employeeNumber = employeeNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }
    }
}
