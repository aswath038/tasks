package Map;

import java.util.ArrayList;
import java.util.HashSet;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> setA = new ArrayList<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		setA.add(5);
		
		ArrayList<Integer> setB = new ArrayList<Integer>();
		setB.add(1);
		setB.add(3);
		setB.add(5);
		setB.add(7);
		setB.add(9);
		 
		System.out.println("setA:" + setA);
		System.out.println("setB:" +setB);
		HashSet<Integer> union = new HashSet<>(setA);
		union.addAll(setB);
		System.out.println("union of setA and setB:" + union);
		}
}
