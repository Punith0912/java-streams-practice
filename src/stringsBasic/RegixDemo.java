package stringsBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RegixDemo {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Banana","try","out","kite","cry","1234","hello132","heart");
		
		// print words which as vowel in it 
		
		words.stream()
		.filter(s -> s.matches(".*[aeiou].*"))
		.forEach(System.out::println);
		
		// print String excluding the digits 
		
		String[] nonDigitString = words.stream()
		.filter(s-> s.matches(".*[0-9].*"))
		.toArray(String[] :: new);
		
		System.out.println(Arrays.toString(nonDigitString));
		
		// Divide a list into 2 one which has number and another which does not have digits
		
		Predicate<String> pred = str -> str.matches(".*[0-9]");
		
				
				Map<Boolean, List<String>> partitionByDigit = words.stream()
		.collect(Collectors.partitioningBy(pred));
		
		System.out.println("with digits"+ partitionByDigit.get(true));
		
		System.out.println("without digits"+ partitionByDigit.get(false));
		
	}

}
