package org.lattice.java.lab.core.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description: this is a java class
 * @author: Lattice
 * @date 2022/5/6 08:38
 */
public class MonitorThread implements Runnable{

    private int seconds;

    private boolean run = true;

    private final ThreadPoolExecutor executor;

    public MonitorThread(ThreadPoolExecutor executor, int seconds) {
        this.seconds = seconds;
        this.executor = executor;
    }

    public void shutdown()  {
        System.out.println("监控线程关闭");
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {
            System.out.printf("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s%n",
                    this.executor.getPoolSize(),
                    this.executor.getCorePoolSize(),
                    this.executor.getActiveCount(),
                    this.executor.getCompletedTaskCount(),
                    this.executor.getTaskCount(),
                    this.executor.isShutdown(),
                    this.executor.isTerminated());
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
