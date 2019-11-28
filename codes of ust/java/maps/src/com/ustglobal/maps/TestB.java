package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	
	HashMap hm=new HashMap();
	hm.put("kuku",594609);
	hm.put("mala",678941);
	hm.put("sheela",458495);
	
	HashMap hm1=new HashMap();
	hm1.put("rina",879045);
	hm1.put("deepu",6858494);
	hm1.put("kriti",4094556);
	
	boolean hashKey=hm.containsKey("mala");
	System.out.println("HasKey"+hashKey);
	
	boolean hasValue=hm.containsValue("4094556");
	System.out.println("hasValue"+hasValue);
	
	hm.putAll(hm1);
	
	System.out.println("after putAll"+hm);
	
	System.out.println(hm.size());
	
	boolean b=hm.isEmpty();
	System.out.println("map  is empty"+b);

	hm.clear();
	System.out.println("after clear"+hm);
}
}
