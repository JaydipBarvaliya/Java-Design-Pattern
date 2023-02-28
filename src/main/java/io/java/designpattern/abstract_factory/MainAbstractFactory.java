package io.java.designpattern.abstract_factory;

public class MainAbstractFactory {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession eng = abstractFactory.getProfession("Engineer");
        eng.print();

    }

}
