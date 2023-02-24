package org.lattice.java.lab.core.singleton;

/**
 * @description: 饿汉式单例模式
 * @author: lattice
 * @date: 2022/12/19 1:55 PM
 */
public class InitializeSingleton {

    private static final InitializeSingleton INSTANCE = new InitializeSingleton();

    private InitializeSingleton() {
    }

    public static InitializeSingleton getInstance() {
        return INSTANCE;
    }

}
