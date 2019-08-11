package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getEmployeeRace(String employeeNumber, String raceId)
    {
        return new EmployeeRace.Builder().employeeNumber(employeeNumber).raceId(raceId).build();
    }
}
