package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
	public static void main(String[]args) { 
	LinkedHashMap<Integer,Integer> pavan = new LinkedHashMap<Integer,Integer>();
	pavan.put(50,new Integer(100));
	pavan.put(150,new Integer(200));
	pavan.put(250,new Integer(300));
	pavan.put(350,new Integer(400));
	pavan.put(450,new Integer(500));
	System.out.println(pavan);
	for(Map.Entry<Integer,Integer> aswath : pavan.entrySet()){
		pavan.entrySet();
	System.out.println(aswath.getKey() + ":" +aswath.getValue());
	
	
	
	}

	}

}
