package org.lattice.java.lab.core.designpatterns.create.singleton;

/**
 * @description: 枚举实现单例模式
 * @author: lattice
 * @date: 2022/12/19 1:56 PM
 */
public enum EnumSingleton {

    METHOD_ONE {
        @Override
        public void doSomething() {
            System.out.println("method one");
        }
    },

    METHOD_TWO {
        @Override
        public void doSomething() {
            System.out.println("method two");
        }
    };

    public abstract void doSomething();
}
