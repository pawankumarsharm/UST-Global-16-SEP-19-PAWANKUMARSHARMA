package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		 Integer i=o1.pincode;
		 Integer f=o2.pincode;
		 return i.compareTo(f);
	}

}
