package io.java.designpattern.abstract_factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Teacher implements Profession{

	@Override
	public void print() {
		System.out.println("Teacher");
		
	}

}



