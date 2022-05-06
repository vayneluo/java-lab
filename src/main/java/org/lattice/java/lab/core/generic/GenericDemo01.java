package org.lattice.java.lab.core.generic;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/4/30 08:44
 */
public class GenericDemo01 {

    public static void main(String[] args) {
        Notepad<String, Integer> notepad = new Notepad<>();
        notepad.setKey("notebook");
        notepad.setValue(18);
        System.out.println("书名" + notepad.getKey());
        System.out.println("数量" + notepad.getValue());
    }
}


class Notepad<K,V> {
    private K key;

    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
