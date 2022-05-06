package org.lattice.java.lab.core.generic;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/29 09:43
 */
class Pointer<T> {

    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}

@Slf4j
public class GenericDemo {

    public static void main(String[] args) {
        Pointer<String> pointer = new Pointer<>();
        pointer.setName("java lab");
        log.info("sdfsdf");
        System.out.println(pointer.getName().length());
    }
}
