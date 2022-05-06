package org.lattice.java.lab.core;

import lombok.Data;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/30 09:17
 */
@Data
public class User {

    private Long id;

    private String name;

    private int age;

    private int sex;

    public User(Long id) {
        this.id = id;
    }
}
