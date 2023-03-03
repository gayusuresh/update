package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample 
{

	public static void main(String[] args) throws IOException 
	{
		FileReader f=new FileReader("d:/studentnew.csv");
		String id,name,address;
		BufferedReader br=new BufferedReader(f);
		String col=br.readLine();//id,name,
		String row=br.readLine();
		System.out.println(col);
		while(row!=null)
		{
		String []s=row.split(",");
		 id=s[0];
		 name=s[1];
		 address=s[2];
			System.out.println(id+name+address);
			
	    row=br.readLine();
	    }
		
}}
