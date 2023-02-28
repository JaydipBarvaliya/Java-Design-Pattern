package io.java.designpattern.singleton;

public class Singleton {
	
	private static Singleton singletonInstance = new Singleton();


	//This constructor is required so no-one can instantiate this class.
	private Singleton(){
		 
	 }

	//Get the only object available
	   public static Singleton getInstance(){
	      return singletonInstance;
	   }
	   
	   public void simpleMethod() {
		   System.out.println("hashcode of singelton object" + singletonInstance);
	   }
	   
}
