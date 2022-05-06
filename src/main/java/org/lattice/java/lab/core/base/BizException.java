package org.lattice.java.lab.core.base;

/**
 * @description: 自定义异常
 * @author: Lattice
 * @date 2022/4/28 18:37
 */
public class BizException extends RuntimeException{

    public BizException() {
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(String message) {
        super(message);
    }
}
