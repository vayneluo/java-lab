package org.lattice.java.lab.core.designpatterns.structure.decoration;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lattice
 * @date: 2023/2/14 5:49 PM
 */
public class InMemoryDatasource implements Datasource {

    private static final Map<String, String> CACHE = new HashMap<>();

    private String name;

    @Override
    public String read() {
        return "read from memory";
    }

    @Override
    public void write(String data) {
        System.out.println("write data to console: " + data);
    }
}
