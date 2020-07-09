package JDBC.CrudOperations;

public class Employee {
	private int EmpID;
	private String EmpName;
	private int DID;

	public Employee() {
		super();
	}

	public Employee(int empID, String empName, int dID) {
		super();
		EmpID = empID;
		EmpName = empName;
		DID = dID;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getDID() {
		return DID;
	}

	public void setDID(int dID) {
		DID = dID;
	}

}
