package stringsexample;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		String word[]=sentence.split(",");
		for(String temp:word)
		{
			System.out.println(temp);
		}
		
	}

}
