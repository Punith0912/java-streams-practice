package stringsIntermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLetter {
	

public static void main(String[] args) {
		
	// Group the List of Strings by First letter
	
		List<String> words = Arrays.asList("banana","try","out","kite","cry","tide","bat","cat");
		
		System.out.println("Grouping by first letter of the String");
		Map<Character, List<String>> groupByFirstLetter =
				words.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		groupByFirstLetter.forEach((key,listStr) -> System.out.println(key+"\t"+ listStr));
				System.out.println();
				
				System.out.println("Grouping by last letter of the String");
				Map<Character, List<String>> groupByLastLetter =
						words.stream()
						.collect(Collectors.groupingBy(s -> s.charAt(s.length()-1)));
				
				groupByLastLetter.forEach((key,listStr) -> System.out.println(key+"\t"+ listStr));
						System.out.println();
		
		// Group the List of Strings by Length of String 
		System.out.println("Grouping by Length of the String");
		Map<Integer, List<String>> groupByLength = words.stream()
		.collect(Collectors.groupingBy(s -> s.length()));
		
		groupByLength.forEach((length,listStr) -> System.out.println(length + "\t"+listStr));
		

}
}

//groupingBy() is a Collector method used with Java Streams to group elements based on a key (property).
//
//It is part of Collectors and usually used with collect().
//
// Definition -> groupingBy() groups stream elements into a Map.
//
//Syntax
//collect(Collectors.groupingBy(classifier))
//
//classifier -> function used to determine the group key
//
