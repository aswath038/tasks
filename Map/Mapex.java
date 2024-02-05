package Map;

import java.util.HashMap;
import java.util.Map;

public class Mapex {
	public static void main(String[]args) {
	Map<String,Integer> aswath = new HashMap<String,Integer>();

	aswath.put("car", new Integer(4857));
	aswath.put("bike", new Integer(485));
	aswath.put("lorry", new Integer(465));
	aswath.put("jeep", new Integer(457));
	aswath.put("bus", new Integer(857));

	for(Map.Entry<String,Integer> suresh : aswath.entrySet()){
		aswath.entrySet();
	System.out.println(suresh.getKey() + ":" +suresh.getValue());
	}
	String Keytoremove ="lorry";
	aswath.remove(Keytoremove);		
	System.out.println(Keytoremove);
	Integer Valuetoremove =465;
	aswath.remove(Valuetoremove);
	System.out.println(Valuetoremove);
	
	
 }
}
