package inheritance;

public class Programmer extends Employee
{
	int salary;
	int pf;
	public Programmer()
	{
		
	}
	public Programmer(int eId,String ename,int salary,int pf)
	{
		seteId(eId);//12
		setEname(ename);//jack
		this.salary=salary;//23000
		this.pf=pf;//6000
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return super.toString()+"Programmer [salary=" + salary + ", pf=" + pf + "]";
	}
	
	

}
