package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 5:23 PM
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new SubAbstractFactoryA();
        AbstractProductA abstractProductA = abstractFactory.createProductA();
        AbstractProductB abstractProductB = abstractFactory.createProductB();
        abstractProductA.methodA();
        abstractProductB.methodB();

        abstractFactory = new SubAbstractFactoryB();
        abstractProductA = abstractFactory.createProductA();
        abstractProductB = abstractFactory.createProductB();
        abstractProductA.methodA();
        abstractProductB.methodB();
    }
}
