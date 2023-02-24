package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 4:44 PM
 */
public abstract class Factory {

    public abstract FactoryBean create();

    public void doSomething() {
        FactoryBean factoryBean = create();
        // do something
        factoryBean.doSomething();
    }

}
