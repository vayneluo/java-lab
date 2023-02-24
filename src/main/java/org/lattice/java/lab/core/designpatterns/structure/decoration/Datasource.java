package org.lattice.java.lab.core.designpatterns.structure.decoration;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/14 5:48 PM
 */
public interface Datasource {

    String read();

    void write(String data);
}
