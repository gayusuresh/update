package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		Employee emp1=new Employee(12,"gayathri","kknagar");
		Employee emp2=new Employee(13,"Ravi","srinagar");

		Employee emp3=new Employee(14,"sugumar","CBE");
		FileOutputStream fout=new FileOutputStream("d:/input.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.writeObject(emp3);
		out.close();


	}

}
