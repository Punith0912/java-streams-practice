package stringsBasic;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {
	
	public static void main(String[] args) {


		List<String> fruits = Arrays.asList("apple","bananna", "orange", "strawberry","kiwi","berry","kiwi");


		// 2. convert the list of Strings to upper case , sort them and print
		
		fruits.stream()
//		//.map(s-> s.toUpperCase())
		.map(String :: toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
	}
}
