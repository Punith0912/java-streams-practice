package stringsBasic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthDemo {
	
	
	public static void main(String[] args) {
		
	List<String> fruits = Arrays.asList("apple","bananna", " ", "orange", "strawberry","kiwi","berry","kiwi");
	
	// 3 get the list of Strings where the length of each element is > 5 and get the count
	
	fruits.stream()
	.filter(s -> s.length() > 5)
	.forEach(System.out::println);
	
	
//  to print   String having more than length 5 along with count	
	
// List<String> output =	fruits.stream()
//	.filter(s -> s.length() > 5)
//	.collect(Collectors.toList());
// 
// // to print 
// System.out.println(output);
// 
// // to print count
// System.out.println(output.size());
// 
 
}

}
