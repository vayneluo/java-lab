package org.lattice.java.lab.core.thread;

/**
 * @description: this is a java class
 * @author: Lattice
 * @date 2022/5/5 20:22
 */
public class JoinExample {

    private class JoinThread extends Thread {
        @Override
        public void run() {
            System.out.println("优先执行当前线程");
        }
    }

    private class WaitingThread extends Thread {
        private JoinThread joinThread;

        public WaitingThread(JoinThread joinThread) {
            this.joinThread = joinThread;
        }

        @Override
        public void run() {
            try {
                joinThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("等待Join线程执行后输出");
        }

    }



    public void test() {
        JoinThread joinThread = new JoinThread();
        WaitingThread waitingThread = new WaitingThread(joinThread);
        joinThread.start();
        waitingThread.start();
    }

    public static void main(String[] args) {
        JoinExample example = new JoinExample();
        example.test();
    }
}
