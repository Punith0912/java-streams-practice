package stringsIntermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class  PartitionBy{
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Banana","try","out","kite","cry");
		
		// Print String that contains vowels
		
		String[] vowels = words.stream()
		.filter(s-> s.matches(".*[aeiou].*"))
		.toArray(String[]::new);
		
		System.out.println(Arrays.toString(vowels));
		
		System.out.println();
		
		//print 2 different List partitioning by containing vowels and not containing vowels
		
//		The partitioningBy() method in Java Streams is used to divide elements into two groups based on a condition (predicate).
		
		Predicate<String> pred = str -> str.matches(".*[aeiou].*");
		
		Map<Boolean, List<String>> partitionByVowels = words.stream()
		.collect(Collectors.partitioningBy(pred));
		
		partitionByVowels.forEach((key,listStr) -> System.out.println(key+"\t"+listStr));
		
		System.out.println();
		
		// or print by key 
		System.out.println("String with vowels"+partitionByVowels.get(true));
		System.out.println("String without vowels"+partitionByVowels.get(false));
		
		
		
	}

}

//
//Why .* is Needed
//
//Without it:
//
//[aeiou]
//
//It would match only a single vowel string like:
//
//"a"
//"e"
//
//But not
//
//apple
//orange
//
//So .* allows characters before and after the vowel.
