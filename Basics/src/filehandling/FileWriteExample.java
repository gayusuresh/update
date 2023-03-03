package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("d:/studentnew.csv");
		fw.write("id,Name,Address");
		fw.write("\n12,Gyathri,kknagar");
		fw.write("\n13,ravi,CBE");
		fw.write("\n14,hari,banglore");
		fw.close();
		

	}

}
