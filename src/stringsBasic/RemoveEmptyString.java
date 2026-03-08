package stringsBasic;

import java.util.Arrays;
import java.util.List;

public class RemoveEmptyString {

	public static void main(String[] args) {


		List<String> fruits = Arrays.asList("apple","bananna", " ",null, "orange", "strawberry","kiwi","berry","kiwi");

		// 1 . remove empty string in array

		String[] output = fruits.stream()
		.filter(s -> s != null && !s.isBlank())
		.toArray(String[] :: new);   // it converts output to array 
		
		System.out.println(Arrays.toString(output));

		
//    printing using terminal operation method
		 fruits.stream()
		.filter(s -> s != null && !s.isBlank())
		.forEach(System.out::println);
	}

}
