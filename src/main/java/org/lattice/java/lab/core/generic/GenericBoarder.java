package org.lattice.java.lab.core.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/30 09:35
 */
public class GenericBoarder {

    public void funA(A a) {
        // ...
    }

    public void funB(B b){
        funA(b);
    }

    public static void funC(List<? extends A> listA) {
        // ...
        listA.forEach(System.out::println);
    }

    public static void funD(List<B> listB) {
        funC(listB);
    }

    public static void main(String[] args) {
        B b1 = new B("小b1");
        B b2 = new B("小b2");
        List<B> listB = new ArrayList<>();
        listB.add(b1);
        listB.add(b2);
        funD(listB);
    }

}

class A {
    private String aName;
}

class B extends A {

    private String bName;

    public B(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "B{" +
                "bName='" + bName + '\'' +
                '}';
    }
}
