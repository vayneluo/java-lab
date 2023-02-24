package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 4:56 PM
 */
public class SubFactoryBeanTwo implements FactoryBean {

    @Override
    public void doSomething() {
        System.out.println("SubFactoryBeanTwo doSomething");
    }
}
