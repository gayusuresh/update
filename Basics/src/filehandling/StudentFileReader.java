package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class StudentFileReader
{
	public void ReadInfo() throws IOException
	{
		ArrayList<Student>list=new ArrayList<Student>();
		FileReader f=new FileReader("d:/student.csv");
		BufferedReader br=new BufferedReader(f);
		String col=br.readLine();
		String row=br.readLine();
		System.out.println(col);
		while(row!=null)
		{
			Student s=createNew(row);
			list.add(s);
			row=br.readLine();
		}
		System.out.println("===========");
		for(Student temp:list)
		{
			System.out.println(temp);
		}
		
	}
	public Student createNew(String row)
	{
		String data[]=row.split(",");
		int  id=Integer.parseInt(data[0]);
		String name=data[1];
		String address=data[2];
		Student s=new Student(id,name,address);
		return s;
	}

}
