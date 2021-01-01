package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		System.out.println(e.getEmpId());
		System.out.println(e.getDesignation());
		e.setDesignation("QA Automation Engineer");
		System.out.println("after resetting "+e.getDesignation());
        System.out.println(e.getSalary());
        e.setSalary(123456.90);
        System.out.println("after slary hike"+e.getSalary());
	   System.out.println(e.getAcctDetails());
	}

}
