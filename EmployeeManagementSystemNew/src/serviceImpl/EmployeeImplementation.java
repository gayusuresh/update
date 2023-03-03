package serviceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Employee;

import service.EmployeeService;

public class EmployeeImplementation  implements EmployeeService
{
	Scanner sc=new Scanner(System.in);

	ArrayList<Employee>list=new ArrayList<Employee>();
	 public EmployeeImplementation()
	 {
		Employee e1=new Employee(1001,"gayathri",23000,"CBE",2);
		list.add(e1);
	 }
	@Override
	public void addEmployee() 
	{
		
		System.out.println("enter the id");
		  int empid=sc.nextInt();
		  System.out.println("enter the name");

		  String ename=sc.next();
		  System.out.println("enter theslary");

		  float salary=sc.nextFloat();
		  System.out.println("enter theaddress");

		  String address=sc.next();
		  System.out.println("enter the exp");
		  int exp=sc.nextInt();
		
		Employee e2=new Employee(empid, ename, salary, address, exp);
		
		list.add(e2);
        
        
	}

	public void updateEmployee() throws NumberFormatException, IOException
	{
		System.out.println("Enter  id:");
		int id=sc.nextInt();//1001
	    int flag=0,index = 0;
	    Employee s=null;
	    for(Employee e:list)
	    {
	    	if(e.geteId()==id)//1001=1001
	    	{
	    		flag=1;
	    		System.out.println(index);
	    		index=list.indexOf(e);//1001
	    		s=e;
	    		System.out.println(s);
	    		break;
	    	}
	    }
	    
	    if(flag==1)
	    {
	    	
			  System.out.println("enter the name");

			  String ename=sc.next();
			  System.out.println("enter theslary");

			  float salary=sc.nextFloat();
			  System.out.println("enter theaddress");

			  String address=sc.next();
			  System.out.println("enter the exp");
			  int exp=sc.nextInt();
			
			s.seteName(ename);
			s.setAddress(address);
			s.setSalary(salary);
			s.setExp(exp);
			list.set(index,s);
			System.out.println("==================================================================================================");

			System.out.println("Employee Details updated!!");
	    }
	    else
	    {
	    	System.out.println("Id does not exist!!");
	    }
		System.out.println("==================================================================================================");

	}
	public void deleteEmployee() throws NumberFormatException, IOException
	{
		System.out.println("Enter  id :");
		int id=sc.nextInt();//101
		int index=0,flag=0;
		Employee s=null;
		
		for(Employee e:list)
		{
			if(id==e.geteId())//101
			{
				flag=1;
				index=list.indexOf(e);
				s=e;
				System.out.println(index);
				break;
			}
		}
		System.out.println("==================================================================================================");

		if(flag==0)
		{
			System.out.println("employee Id does not exist!!");
		}
		else
		{
			list.remove(s);
			System.out.println("employee record deleted successfully!!");
		}}
		


	@Override
	public void findAllEmployee ()
	{
		
		if(list.size()==0)
		{
			System.out.println("No record found!!");
		}
		
		
		for(Employee s1:list)
		{
	System.out.println(s1);

	}
	}
}
