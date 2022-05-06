package org.lattice.java.lab.core.thread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description: handler to reject execute thread
 * @author: Lattice
 * @date 2022/5/6 08:33
 */
public class RejectionExecutionHandlerImpl implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + "is rejected");
    }
}
