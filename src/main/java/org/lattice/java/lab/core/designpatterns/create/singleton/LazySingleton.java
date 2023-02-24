package org.lattice.java.lab.core.designpatterns.create.singleton;

/**
 * @description: 懒汉式单例模式
 * 1.线程不安全
 * 2.类加载时不初始化，延迟加载，节省内存
 * 3.多线程下会出现多个实例
 * 4.需要加锁 synchronized 才能保证单例，但加锁会影响效率
 * 5.双重检查锁
 * @author: lattice
 * @date: 2023/2/17 1:54 PM
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
