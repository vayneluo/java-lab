package org.lattice.java.lab.core.spi;

import java.util.List;

/**
 * @description: SPI机制
 * @author: Lattice
 * @date 2022/5/4 10:39
 */
public interface Search {

    List<String> search(String keyword);
}
