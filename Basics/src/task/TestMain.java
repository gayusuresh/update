package task;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
          int t = in.nextInt();//2
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();//10
            long a=(n-1)/3;
            System.out.println(a);
            long b=(n-1)/15;
            System.out.println(b);
            long c=((n-1)/5);
            System.out.println(c);
            System.out.println(3*(((a+1)*a)/2) +5*(((c+1)*c)/2)-15*(((b+1)*b)/2));
    }

	}

}
