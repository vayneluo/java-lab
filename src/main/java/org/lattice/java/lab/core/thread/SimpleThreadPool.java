package org.lattice.java.lab.core.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: this is a java class
 * @author: Lattice
 * @date 2022/5/6 08:27
 */
public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            WorkerThread workerThread = new WorkerThread(String.valueOf(i));
            executorService.execute(workerThread);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        System.out.println("Finished all threads");
    }
}
