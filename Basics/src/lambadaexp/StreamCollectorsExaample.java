package lambadaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsExaample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}
		Stream<Integer> stream = list.stream();//1,2,3,4,5,6,7,8,9
		List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
		                                    .collect(Collectors.toList());
		System.out.print(evenNumbersList);


	}

}
