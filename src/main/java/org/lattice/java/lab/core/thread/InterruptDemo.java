package org.lattice.java.lab.core.thread;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/5/5 08:31
 */
public class InterruptDemo {

    public static class MyThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(200);
                System.out.println("my thread is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("main is running...");
    }

}
