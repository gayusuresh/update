package filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("one.txt");
		BufferedReader br=new BufferedReader(f);
		int i;
		while((i=br.read())!=-1)
		{
		
		
		
		System.out.println((char)i);
		}

	}}


