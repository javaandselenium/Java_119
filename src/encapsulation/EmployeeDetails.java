package encapsulation;

public class EmployeeDetails {
	
	private int empId=1234;
	private String designation="QA Engieer";
	private double salary=5678.90;
	private int acctDetails=7657866;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public int getAcctDetails() {
		return acctDetails;
	}

}
