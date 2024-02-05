package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String[] abcs = {"Roja", "Suresh", "Sushmitha","Abhilash", "Chandrika","Jagadeesh"};
				ArrayList<String> S = new ArrayList<String>(Arrays.asList(abcs));
				Map<String, List<Character>> m = new HashMap<>();
				for(String xyz : S) {
					List<Character> lc = new ArrayList<>();
				char start = xyz.charAt(0);
				char end = xyz.charAt(xyz.length()-1);
				lc.add(start);
				lc.add(end);
				m.put(xyz,lc);
				}
				System.out.println(m);
			}

		
	}


