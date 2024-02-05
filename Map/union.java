package Map;

import java.util.HashSet;
import java.util.Set;

public class union {
	public static void main(String[]args) {
		 Set<Integer> setA = new HashSet<>();
	        setA.add(1);
	        setA.add(2);
	        setA.add(3);

	       
	        Set<Integer> setB = new HashSet<>();
	        setB.add(7);
	        setB.add(4);
	        setB.add(5);
	        setB.add(3);

	       
	        System.out.println("Set A: " + setA);
	        System.out.println("Set B: " + setB);
	        
	        Set<Integer> union=new HashSet<Integer>();
	         union.addAll(setA);
	         union.addAll(setB);
	         System.out.println("union " + union);
	         
	         union.remove(7);
	         System.out.println("unionSet after removing element :" + union);
	         
	     
	        
	}

   
	        
	    }
	
	

