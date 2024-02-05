package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class vowelex2 {

	public static void main(String[] args) {
		String [] str = {"virat","rohit","msdhoni","rahul","sachin","mahesh","nikhil","rakesh"};
		Map<String,ArrayList<Character>> vowels = new HashMap<>();	
		
	for(String name:str) {
		name.toLowerCase();
		ArrayList<Character> a=new ArrayList<Character>();
		
		for(int i=0;i<name.length();i++)
		{
			char c = name.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				a.add(c);
			 }		
		}
		vowels.put(name,a);
	}
		System.out.println(vowels);
	}
}


