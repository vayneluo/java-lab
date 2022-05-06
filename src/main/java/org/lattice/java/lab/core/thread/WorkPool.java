package org.lattice.java.lab.core.thread;

import java.util.concurrent.*;

/**
 * @description: this is a java class
 * @author: Lattice
 * @date 2022/5/6 08:43
 */
public class WorkPool {

    public static void main(String[] args) throws InterruptedException {
        RejectionExecutionHandlerImpl rejectionExecutionHandler = new RejectionExecutionHandlerImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        /**
         * 线程池参数
         * 核心线程数 = 2
         * 最大线程数 =4
         * 存活时间 = 10s
         * 无界队列 初始容量为 2
         * 默认线程工厂
         * 拒绝策略
         */
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(4),threadFactory , rejectionExecutionHandler);
        // 定义监控线程，打印当前线程池状态 每隔3s输出信息
        MonitorThread monitorThread = new MonitorThread(executor, 3);
        Thread thread = new Thread(monitorThread);
        thread.start();

        for (int i = 0; i < 10; i++) {
            executor.execute(new WorkerThread("cmd" + i));
        }

        Thread.sleep(30000);

        // 关闭线程池、监控线程
        executor.shutdown();
        monitorThread.shutdown();

    }
}
