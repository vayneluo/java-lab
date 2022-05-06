package org.lattice.java.lab.core.generic;

import org.lattice.java.lab.core.User;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/30 09:13
 */
public class GenericMethod {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        User object = (User) GenericMethod.getObject(Class.forName("org.lattice.java.lab.core.User"));
        User object1 = (User) GenericMethod.getObject(User.class);
        System.out.println(object);
    }


    /**
     * 泛型方法 获取对象
     * @param clazz 类 class
     * @param <T> 指明入参 泛型T的具体类型
     * @return 返回一个类型T
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> T getObject(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}
