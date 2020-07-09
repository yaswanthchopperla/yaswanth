package JDBC.CrudOperations;

import java.util.List;

public class EmployeeSer {
    public static String createEmployee(Employee emp) {
    	return new EmployeeDAO().createEmployee(emp);
    }
    public static String updateEmployee(int dID,int empID, String empName) {
    	return new EmployeeDAO().updateEmployee(dID,empID,empName);
    }
    public static String deleteEmployee(int DID,int EmpID ) {
    	return new EmployeeDAO().deleteEmployee(DID,EmpID);
    }
    public static List<Employee> getAllEmployees(int DID){
    	return new EmployeeDAO().getAllEmployees(DID);
    }
}
