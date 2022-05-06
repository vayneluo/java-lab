package org.lattice.java.lab.core;

import lombok.Data;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/2/17 08:36
 */
@Data
public class SubClazz extends ParentClazz{

    private int age;

    private String name;

    public SubClazz() {
    }

    private SubClazz(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public SubClazz(String name) {
        this.name = name;
    }
}


