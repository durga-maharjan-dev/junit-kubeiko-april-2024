package junit.service;

import java.util.List;

import junit.dto.EmployeeDTO;
import junit.dto.LoginDTO;

public interface EmployeeService {

	EmployeeDTO insertEmployee(EmployeeDTO dto);
	
	EmployeeDTO authenticateEmployee(LoginDTO dto);

	EmployeeDTO findEmployeeById(int employeeId);

	EmployeeDTO updateEmployee(EmployeeDTO dto);
	
	List<EmployeeDTO> getAllEmployees();

}
