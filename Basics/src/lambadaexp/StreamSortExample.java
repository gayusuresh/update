package lambadaexp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Sansa","Jon","Arya");

		List<String> sortName = names.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

               System.out.print(sortName);
               boolean matchedResult = names.stream()
            	        .anyMatch((s) -> s.startsWith("A"));
            	 
            	System.out.println(matchedResult);     //true
            	 
            	matchedResult = names.stream()
            	        .allMatch((s) -> s.startsWith("A"));
            	 
            	System.out.println(matchedResult);     //false
            	 
            	matchedResult = names.stream()
            	        .noneMatch((s) -> s.startsWith("A"));

            	System.out.println(matchedResult);
	}

}
