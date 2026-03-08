package stringsIntermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseStringList {
	
	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple","bananna", "papaya", "orange", "strawberry","kiwi","berry");
		
		IntStream.range(0, fruits.size())
		.mapToObj(i -> fruits.get(fruits.size()-1-i))  // points to end index of fruits and that is swaped to first index 
		.forEach(System.out::println);
		
		
	}

}
