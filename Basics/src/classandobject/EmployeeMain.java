package classandobject;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=1001;
		emp.name="gayathri";
		emp.salary=34000;
		System.out.println("The Employee id=:"+emp.id);
		System.out.println("The Employee name=:"+emp.name);
		System.out.println("The Employee salary=:"+emp.salary);
		System.out.println("Annual Salary=:"+emp.annualSalary());
		System.out.println("Pf=:"+emp.pf());

	}

}
