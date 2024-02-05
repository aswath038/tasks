package Map;

import java.util.HashSet;
import java.util.Set;

public class difference {
	public static void main(String[]args) {
		 Set<String> setA = new HashSet<>();
	        setA.add("cbit");
	        setA.add("srit");
	        setA.add("aits");
	        setA.add("mits");
	        setA.add("nit");
	        setA.add("gits");

	       
	        Set<String> setB = new HashSet<>();
	        setB.add("vits");
	        setB.add("ksrm");
	        setB.add("glbc");
	        setB.add("mits");
	        setB.add("aits");
	        System.out.println("Set A: " + setA);
	        System.out.println("Set B: " + setB);
	        
	        Set<String>differenceSet=new HashSet<>(setA );
	        differenceSet.retainAll(setB);
	        

	        System.out.println("Difference of setA and setB: " + differenceSet);
	        
	     
	}

}
