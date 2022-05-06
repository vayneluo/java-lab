package org.lattice.java.lab.core.spi;

import java.util.List;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/5/4 10:40
 */
public class DbSearch implements Search{
    @Override
    public List<String> search(String keyword) {
        System.out.println("数据库搜索");
        return null;
    }
}
