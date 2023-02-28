package io.java.designpattern.factory;

public class Doctor implements Profession{

	@Override
	public void getProfessionName() {
		System.out.println("I'm Doctor");
	}

}
