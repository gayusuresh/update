package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		File f=new File("d:/A1.txt");
		
		
		if(f.createNewFile())
		{
			System.out.println("file is successfully");
		}
		else
		{
			System.out.println("already created");
		}

	}

}
