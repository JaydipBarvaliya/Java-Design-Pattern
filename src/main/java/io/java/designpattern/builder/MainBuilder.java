package io.java.designpattern.builder;


public class MainBuilder {
	public static void main(String[] args) {
		
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		//create object of director that will keep an eye on your builder
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstruction();

		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
	}

}
