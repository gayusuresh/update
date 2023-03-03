package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiazationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("d:/input.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee e=(Employee) oin.readObject();
		System.out.println(e);
		Employee e1=(Employee) oin.readObject();
		System.out.println(e1);
		
		Employee e2=(Employee) oin.readObject();
		System.out.println(e2);
		
		

	}

}
