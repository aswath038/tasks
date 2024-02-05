package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vowelex {

	public static void main(String[] args) {
		
		        String[] abcs = {"Roja", "Suresh", "Sushmitha", "Abhilash", "Chandrika", "Jagadeesh"};
		        ArrayList<String> P = new ArrayList<>(Arrays.asList(abcs));
		        Map<String, List<Character>> m = new HashMap<>();

		        for (String xyz : P) {
		            List<Character> vowels = new ArrayList<>();
		            for (char c : xyz.toCharArray()) {
		                if (isVowel(c)) {
		                    vowels.add(c);
		                }
		            }
		            m.put(xyz, vowels);
		        }

		        System.out.println(m);
		    }

		    private static boolean isVowel(char c) {
		        return "aeiouAEIOU".indexOf(c) != -1;
		    }
		

	}


