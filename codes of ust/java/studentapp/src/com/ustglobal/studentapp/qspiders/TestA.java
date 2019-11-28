package com.ustglobal.studentapp.qspiders;
//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;
import com.ustglobal.studentapp.jspiders.*;
public class TestA {

	public static void main(String[] args) {
		Qtp q=new Qtp();
		q.teachQtp();
		
		Salenium s=new Salenium();
		s.teachSalenium();
		
		//com.ustglobal.studentapp.jspiders.Angular a=new com.ustglobal.studentapp.jspiders.Angular();
		//com.ustglobal.studentapp.jspiders.Angular b=new com.ustglobal.studentapp.jspiders.Angular();
		
		Angular a=new Angular();
		a.teachAngular();
		
		React r=new React();
		r.teachReact();
		
	}

}
