package org.lattice.java.lab;

import org.junit.Test;
import org.lattice.java.lab.core.SubClazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/26 09:50
 */
public class ReflectTestExample {


    @Test
    public void test() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<SubClazz> aClass = SubClazz.class;
        SubClazz subClazz = aClass.newInstance();
        subClazz.setAge(11);
        subClazz.setName("tony");
        System.out.println(subClazz);

        Constructor<SubClazz> constructor = aClass.getDeclaredConstructor(String.class);
        SubClazz vayne = constructor.newInstance("vayne");
        System.out.println(vayne);


        Constructor<SubClazz> privateConstructor = aClass.getDeclaredConstructor(int.class, String.class);

        privateConstructor.setAccessible(true);

        SubClazz lattice = privateConstructor.newInstance(18, "lattice");
        System.out.println(lattice);


        for (Field field : aClass.getFields()) {
            System.out.println(field);
        }
        SubClazz modify = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(modify, "modifyName");

        Object o = name.get(modify);
        System.out.println(modify);
        System.out.println(o);


    }
}
