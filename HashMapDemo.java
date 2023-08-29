package collection_first_rivision;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<String, Integer>();
    hm.put("vikas", 5585623);
    hm.put("zebra", 866563);
    hm.put("raj", 44444444);
    hm.put("aaa",46666);
    
    System.out.println(hm.entrySet());
    System.out.println("=====");
    
    System.out.println(hm.keySet());
    System.out.println(hm.values());
    System.out.println(hm.containsKey("raj"));
    System.out.println(hm.containsValue(5585623));
    hm.replace("aaa", 5555);
    hm.forEach((k,v)->System.out.println(k+v));
    
    
    
		
		
	}

}
