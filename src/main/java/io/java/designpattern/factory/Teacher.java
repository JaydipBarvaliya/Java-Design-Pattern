package io.java.designpattern.factory;

public class Teacher implements Profession{

	@Override
	public void getProfessionName() {
		System.out.println("I'm Teacher");
	}

}
