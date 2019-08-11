package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(String employeeNumber, String genderId)
    {
        return new EmployeeGender.Builder().employeeNumber(employeeNumber).genderId(genderId).build();
    }
}
