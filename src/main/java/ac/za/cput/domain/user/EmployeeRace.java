package ac.za.cput.domain.user;

public class EmployeeRace {

    private String employeeNumber, raceId;

        public EmployeeRace(Builder builder)
    {
        this.employeeNumber = builder.employeeNumber;
        this.raceId = builder.raceId;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public String getRaceId()
    {
        return raceId;
    }

    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public void setRaceId()
    {
        this.raceId = raceId;
    }

    public static class Builder{
        private String employeeNumber, raceId;

        public Builder employeeNumber(String employeeNumber)
        {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build()
        {
            return new EmployeeRace(this);
        }

        public Builder copy(EmployeeRace employeeRace)
        {
            this.employeeNumber = employeeNumber;
            this.raceId = raceId;
            return this;
        }
    }
}
