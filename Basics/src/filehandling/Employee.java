package filehandling;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int id;
	private String eName;
	private String address;
	public Employee()
	{
		
	}
	public Employee(int id, String eName, String address) {
		super();
		this.id = id;
		this.eName = eName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", address=" + address + "]";
	}
	

}
