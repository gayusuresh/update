package inheritance;

public class Student extends Person
{
	private int attendance;
	private int m1,m2,m3;
	
	public Student()
	{
		
	}

	public Student(int id, String pname, String address, String city, String state,int attendance, int m1, int m2, int m3) {
		super(id,pname,address,city,state);
		this.attendance = attendance;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public double percentage()
	{
		int total=m1+m2+m3;
		double percentage=(total*100)/300.0;
		return percentage;
	}

	@Override
	public String toString() {
		return "Student [attendance=" + attendance + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", percentage()="
				+ percentage() + "]";
	}

	
	

}
