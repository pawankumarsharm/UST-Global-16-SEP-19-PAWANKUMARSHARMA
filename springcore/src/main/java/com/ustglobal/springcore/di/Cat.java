package com.ustglobal.springcore.di;
import com.ustglobal.springcore.di.Animal;

public class Cat implements Animal {

	@Override
	public void makeSound() {
			System.out.println("Meeeooooooooooooooooooo");
	}

}
