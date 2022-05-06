package org.lattice.java.lab.core.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: this is a java class
 * @author: Lattice
 * @date 2022/5/6 08:12
 */
public class FutureTaskDemo {

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            System.out.println("Thread [" + Thread.currentThread().getName() + "] is running");
            int result = 0;
            for(int i = 0; i < 100;++i) {
                result += i;
            }

            Thread.sleep(3000);
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        Thread thread = new Thread(futureTask);
        thread.setName("Task thread");
        thread.start();
        Thread.sleep(1000);
        System.out.println("Thread [" + Thread.currentThread().getName() + "] is running");
        if (!futureTask.isDone()) {
            System.out.println("Task is not done");
            Thread.sleep(2000);
        }
        int res = futureTask.get();
        System.out.println("result is " + res);
    }
}
