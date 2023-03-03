package task;

import java.util.ArrayList;

public class Student 
{
	private int id;
	private String name;
	private int sub1,sub2,sub3,sub4,sub5;
	public Student()
	{
		
	}
	public Student(int id,String name,int sub1,int sub2,int sub3,int sub4,int sub5 )
	{
	    this.id=id;
	    this.name=name;
	    this.sub1=sub1;
	    this.sub2=sub2;
	    this.sub3=sub3;
	    this.sub4=sub4;
	    this.sub5=sub5;
	    
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSub4() {
		return sub4;
	}
	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}
	public int getSub5() {
		return sub5;
	}
	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	
	public double getPercentage()
	{
		int total=sub1+sub2+sub3+sub4+sub5;
		double percentage=(total*100)/500.0;
		return percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", sub4=" + sub4 + ", sub5=" + sub5 + ", getPercentage()=" + getPercentage() + "]";
	}

	


}
