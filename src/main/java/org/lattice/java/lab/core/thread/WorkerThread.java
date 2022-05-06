package org.lattice.java.lab.core.thread;

/**
 * @description: 工作线程
 * @author: Lattice
 * @date 2022/5/6 08:24
 */
public class WorkerThread implements Runnable{

    private String command;

    public WorkerThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start, Command is "  + command);
        doProcess();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    @Override
    public String toString() {
        return "WorkerThread{" +
                "command='" + command + '\'' +
                '}';
    }

    private void doProcess() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
