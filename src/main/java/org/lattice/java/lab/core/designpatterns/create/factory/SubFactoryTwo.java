package org.lattice.java.lab.core.designpatterns.create.factory;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/24 5:01 PM
 */
public class SubFactoryTwo extends Factory{

    @Override
    public FactoryBean create() {
        return new SubFactoryBeanTwo();
    }
}
