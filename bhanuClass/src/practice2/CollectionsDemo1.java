package practice2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		System.out.println("------Using ArrayList------");
		//with ArrayList we need to remember index of every value
		ArrayList<String> list=new ArrayList<String>();
		list.add("Datta");
		list.add("Bangalore");
		
		for(String text:list) {
			System.out.println(text);
		}
		System.out.println("------Using HashMap------");
		
		//with HashMap no indexing required, key can be used to access values
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("name", "Datta");
		hm.put("city", "Bangalore");
		System.out.println(hm.get("name"));//Retrieve key name value
		System.out.println(hm.get("city"));
		System.out.println("----------");
		System.out.println(hm.containsKey("name"));//true
		System.out.println(hm.containsValue("Datta"));//true
		
		Set<String> keys = hm.keySet();
		System.out.println("......key set.....");
		for(String key:keys) {
			System.out.println(key);
		}
		Collection<String> values = hm.values();
		System.out.println(".....values set...");
		for(String value:values) {
			System.out.println(value);
		}
		System.out.println("[keys,Vlaues]");
		System.out.println("--------------");
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println("------Using LinkedHashMap------");
		//with ArrayList we need to remember index of every value
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String, String>();
		lhm.put("phone", "Mi A1");
		lhm.put("street", "JP nagar");
		System.out.println(lhm.get("phone"));
		System.out.println(lhm.get("street"));
		Set<String> lhmkey = lhm.keySet();
		System.out.println("......hmlkey set.....");
		for(String key:lhmkey) {
			System.out.println(key);
		}
		Collection<String> lhmvalue = lhm.values();
		System.out.println(".....values set...");
		for(String value:lhmvalue) {
			System.out.println(value);
		}
	

	}

}
