package org.lattice.java.lab.core.designpatterns.create.singleton;

/**
 * @description: 饿汉式单例模式
 * 1.线程安全
 * 2.类加载时就初始化，浪费内存
 * @author: lattice
 * @date: 2023/2/17 1:52 PM
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
