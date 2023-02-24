package org.lattice.java.lab.core.thread;

import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @description:
 * @author: lattice
 * @date: 2023/1/17 11:26 AM
 */
public class ProducerConsumerDemo {

    private static final int MAX_SIZE = 10;

    private static final LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>();

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == MAX_SIZE) {
                        try {
                            System.out.println("queue is full, producer is waiting");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        String str = UUID.randomUUID().toString();
                        queue.add(str);
                        System.out.println("生产开始, uuid is " + str);
                        Thread.sleep(500);
                        queue.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        producer.start();

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == 0) {
                        try {
                            System.out.println("queue is empty, waiting for producer");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        System.out.println("消费开始： " + queue.take());
                        Thread.sleep(500);
                        queue.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        });
        consumer.start();
    }
}
