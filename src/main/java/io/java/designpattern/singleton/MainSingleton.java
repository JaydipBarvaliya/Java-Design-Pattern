package io.java.designpattern.singleton;

public class MainSingleton {
	public static void main(String[] args) {
		Singleton singletonObject = Singleton.getInstance();
		singletonObject.simpleMethod();
		
		Singleton singletonObject2 = Singleton.getInstance();
		singletonObject2.simpleMethod();
		
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		
		Teacher teacher2 = new Teacher();
		System.out.println(teacher2);
	}

}
