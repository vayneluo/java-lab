package org.lattice.java.lab.core.designpatterns.create.singleton;

/**
 * @description: 懒汉式单例模式
 * 1.双重检查锁
 * 2.线程安全
 * @author: lattice
 * @date: 2022/12/19 1:49 PM
 */
public class DoubleCheckSingleton {

    private DoubleCheckSingleton() {
    }

    private static volatile DoubleCheckSingleton singleton;

    private static DoubleCheckSingleton getInstance() {
        if (null == singleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == singleton) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
