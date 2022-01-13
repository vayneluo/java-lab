package org.lattice.java.lab.java8.function;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @description: 流处理器
 * @author: Lattice
 * @date 2022/1/13 14:02
 */
@FunctionalInterface
public interface BufferedReaderProcessor {

    /**
     * Processor this reader on the given arguments.
     *
     * @param reader buffered reader
     * @return reader processor result
     */
    String processor(BufferedReader reader) throws IOException;
}
