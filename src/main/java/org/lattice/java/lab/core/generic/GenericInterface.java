package org.lattice.java.lab.core.generic;

/**
 * @description: 泛型接口
 * @author: Lattice
 * @date 2022/4/30 09:01
 */
public class GenericInterface {

    public static void main(String[] args) {
        Info<String> info = new InfoImpl<>("lattice");
        String show = info.show();
        System.out.println(show);
    }

}


interface Info<T> {
    T show();
}

class InfoImpl<T> implements Info<T>{

    private T t;

    public InfoImpl(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public T show() {
        System.out.println("show something");
        return t;
    }
}
