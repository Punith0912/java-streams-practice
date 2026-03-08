package stringsIntermidiate;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Banana","try","out","kite","cry");
		
		words.stream()
		.map(s -> new StringBuilder(s).reverse())
		.forEach(System.out::println);
		
}
}
