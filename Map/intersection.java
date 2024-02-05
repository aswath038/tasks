package Map;

import java.util.HashSet;
import java.util.Set;

public class intersection {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(8);
        setA.add(9);
        setA.add(6);
        
        
        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(8);
        setB.add(5);
        setB.add(3);
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        
       
        Set<Integer>intersectionSet=new HashSet<>(setA);
        intersectionSet.retainAll(setB);

        System.out.println("Intesection of setA and setB: " + intersectionSet);
       
        intersectionSet.remove(8);
        System.out.println("intersectionSet after removing element :" + intersectionSet);
        
       
        
        
    
	}

}
