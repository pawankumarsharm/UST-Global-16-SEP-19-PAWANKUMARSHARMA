package com.ustglobal.maps;

import java.util.HashMap;

public class classA {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("kuku",594609);
		hm.put("mala",678941);
		hm.put("sheela",458495);
		hm.put(null,456789);
		hm.put(null,456787);
		
		System.out.println("Data"+hm);
		hm.put("mala",789898);
		System.out.println("after modify"+hm);
		hm.put("dimple",789898);
		System.out.println("after dimple"+hm);
		
		System.out.println("after null"+hm);
	
		System.out.println("after adding duplicate null"+hm);
		
		
		System.out.println("=================");
		
		Object phoneno=hm.get("sheela");
		System.out.println("value"+phoneno);
		
		System.out.println("==================");
		Object phoneno1=hm.get("abc");
		System.out.println("value"+phoneno1);
		
		System.out.println("==================");
		
		Object value=hm.remove("kuku");
		System.out.println("value"+value);
		
		System.out.println("after remove---->"+hm);
	}

}
