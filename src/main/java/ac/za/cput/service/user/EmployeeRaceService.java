package ac.za.cput.service.user;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {

    Set<EmployeeRace> getAll();
}
