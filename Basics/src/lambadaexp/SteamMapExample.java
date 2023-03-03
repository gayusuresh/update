package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class SteamMapExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sansa","Jon","Arya");
		names.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(n->System.out.println(n));


	}

}
