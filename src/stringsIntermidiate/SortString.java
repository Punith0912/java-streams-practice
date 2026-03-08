package stringsIntermidiate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortString {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","bananna", " ", "orange", "strawberry","kiwi","berry","kiwi");
		
		// sort alphabettically in reverse order
		
		fruits.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		

		// sort the list of String based on the length of the String

		//1.	using the Comparator interface - > 

		fruits.stream()
		.sorted((o1,o2) -> ((Integer)o1.length()).compareTo(o2.length()))
		//.sorted((o1,o2) -> ((Integer)o2.length()).compareTo(o1.length())) //for descending sort reverse sort
		.forEach(System.out::println);

		//2.  using the comparator inbuilt method - > comparing
		//The comparing() method belongs to the Comparator interface and is used to create a Comparator based on a key extracted from objects.

		fruits.stream()
		.sorted(Comparator.comparing(String::length).reversed())
		.forEach(System.out::println);
		
		
		// Find the Longest String on the list
		Optional<String> longString = fruits.stream()
		.max(Comparator.comparing(String::length));
		
		if(longString.isPresent())
			System.out.println(longString.get());
		



	}
}
