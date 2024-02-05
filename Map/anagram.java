package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram {

	public static void main(String[] args) {
		  String str[] = {"abc", "cat", "apple", "mat", "cab", "tac", "paple", "bca", "sat", "tam", "atm"};

	       
	        Map<String, List<String>> Groups = new HashMap<>();

	        for (String word : str) {
	           
	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String sortedWord = new String(chars);

	           
	            Groups.putIfAbsent(sortedWord, new ArrayList<>());

	          
	            Groups.get(sortedWord).add(word);
	        }

	        List<List<String>> result = new ArrayList<>(Groups.values());

	        System.out.println("Output: " + result);
	   
	

	}



	}


