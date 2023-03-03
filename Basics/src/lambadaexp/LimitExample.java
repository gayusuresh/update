package lambadaexp;

import java.util.stream.Stream;

public class LimitExample {

	public static void main(String[] args) {
		
        Stream.iterate(1, count->count+1)  
        .filter(number->number%3==0)  
        .limit(3)  
        .forEach(n->System.out.println(n)); 


	}

}
