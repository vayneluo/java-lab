package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 5:24 PM
 */
public class SubAbstractFactoryA extends AbstractFactory{
    @Override
    AbstractProductA createProductA() {
        return new SubAbstractProductA();
    }

    @Override
    AbstractProductB createProductB() {
        return new SubAbstractProductB();
    }
}
