package stringsBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RemoveDuplicates {


	public static void main(String[] args) {
		
	List<String> fruits = Arrays.asList("apple","bananna", "berry", "orange", "strawberry","kiwi","berry","kiwi", "pomogranate","papaya");
	
	// Remove duplicates
	System.out.println("removing duplicates");
	fruits.stream()
	.distinct()
	.sorted()
	.forEach(System.out::println);
	
	System.out.println();
	// filter by word 
	
	System.out.println("Filter by Word");
	fruits.stream()
	.filter(s-> s.contains("berry"))
	.forEach(System.out::println);
	
	System.out.println();
	
	System.out.println("Remove words strating with b");
	fruits.stream()
	.filter(s-> !s.startsWith("b"))
	.forEach(System.out::println);
	
System.out.println();
	
	System.out.println("Find first string start with starting letter P ");
	
	Optional<String> str = fruits.stream()
	.map(String::toUpperCase)
	.filter(s-> s.startsWith("z"))
	.findFirst();
	
	if(!str.isPresent()) {
	  System.out.println(str.get());
	}
	else
		System.out.println("No elements found");
	
	
	}
	
}
