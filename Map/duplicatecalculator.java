package Map;

import java.util.HashMap;
import java.util.Map;

public class duplicatecalculator {
	public static void main(String[]args) {
		 
		        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 3, 1, 9, 10, 5, 11, 11};

		        Map<Integer, Integer> frequencyMap = new HashMap<>();

		        // Count the frequency of each element in the array
		        for (int num : array) {
		            if (frequencyMap.containsKey(num)) {
		                frequencyMap.put(num, frequencyMap.get(num) + 1);
		            }
		            else 
		                frequencyMap.put(num, 1);
		            
		        }

		        // Display duplicate values	
		       
		        System.out.println("Duplicate values in the array:");
		        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + " - Occurs " + entry.getValue() + " times");
		               
		            }
		        }
		}
}
