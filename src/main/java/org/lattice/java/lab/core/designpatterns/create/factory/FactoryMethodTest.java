package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 5:02 PM
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        Factory factory = new SubFactoryOne();
        factory.doSomething();

        factory = new SubFactoryTwo();
        factory.doSomething();
    }
}
