package org.lattice.java.lab.core.singleton;

/**
 * @description: 静态内部类实现单例模式
 * @author: lattice
 * @date: 2022/12/19 1:52 PM
 */
public class InnerClassSingleton {

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
