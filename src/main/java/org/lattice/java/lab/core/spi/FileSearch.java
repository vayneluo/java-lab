package org.lattice.java.lab.core.spi;

import java.util.List;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/5/4 10:40
 */
public class FileSearch implements Search{
    @Override
    public List<String> search(String keyword) {
        System.out.println("文件搜索");
        return null;
    }
}
