package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		Consumer<Integer> cnsmr = x -> System.out.println(x);
		intSeq.forEach((java.util.function.Consumer<? super Integer>) cnsmr);

	}

}
