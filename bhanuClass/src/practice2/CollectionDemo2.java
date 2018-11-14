package practice2;

import java.util.LinkedHashMap;

public class CollectionDemo2 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lmap=new LinkedHashMap<String,Integer>();
	
		lmap.put("chairs", 45);
		lmap.put("projectors", 2);
		System.out.println("No of chairs: "+lmap.get("chairs"));
		System.out.println("No of projectors: "+lmap.get("projectors"));
	}

}
