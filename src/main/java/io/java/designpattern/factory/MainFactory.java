package io.java.designpattern.factory;

public class MainFactory {
	
	public static void main(String[] args) {

		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession profession = professionFactory.getProfession("Doctor");

		profession.getProfessionName();
		
	}

}
