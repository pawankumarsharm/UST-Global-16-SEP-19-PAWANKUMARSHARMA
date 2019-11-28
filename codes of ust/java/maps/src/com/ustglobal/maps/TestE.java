package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestE {
public static void main(String[] args) {
	TreeMap<String, Integer> lh=new TreeMap<String, Integer>();
	lh.put("banglore",560068);
	lh.put("hariyana",134203);
	lh.put("ranchi",834001);
	//lh.put(null, 880000);//null pointer exception
	
	
	for(Map.Entry<String, Integer> m: lh.entrySet()) {
		String key=m.getKey();
		Integer value=m.getValue();
		System.out.println("key is"+key);
		System.out.println("value is"+value);
		System.out.println("==============");
				}
	
	
	System.out.println(lh);
	
}
}
