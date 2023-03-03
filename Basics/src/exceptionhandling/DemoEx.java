package exceptionhandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class DemoEx {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
        String date;
        System.out.println("Enter the string to be converted to date");
        date = sc.nextLine();
        LocalDate d = LocalDate.parse(date);
        System.out.println(d);


	}

}
