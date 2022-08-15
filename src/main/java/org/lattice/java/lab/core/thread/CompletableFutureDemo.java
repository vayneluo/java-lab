package org.lattice.java.lab.core.thread;

import cn.hutool.core.thread.ThreadFactoryBuilder;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;

import java.util.concurrent.*;

/**
 * @description: CompletableFuture
 * @author: Lattice
 * @date 2022/6/8 13:39
 */
public class CompletableFutureDemo {


    public static void main(String[] args) throws Exception{
        ThreadFactory threadFactory = ThreadFactoryBuilder.create().setNamePrefix("cpt-").build();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 4, 60,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(10), threadFactory);

        /*CompletableFuture<String> cpt1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行步骤1");
            return "step1 result";
        }, executor);
        CompletableFuture<String> cpt2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行步骤2");
            return "step2 result";
        }, executor);
        cpt1.thenCombine(cpt2, (res1, res2) -> {
            System.out.println(res1 + "," + res2);
            System.out.println("执行步骤3");
            return "step3 result";
        }).thenAccept(System.out::println);

        CompletableFuture<String> cpt4 = CompletableFuture.completedFuture("result4");
        CompletableFuture<String> cpt5 = new CompletableFuture<>();
        cpt5.complete("success");*/


        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("cf1 start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "cf1 success";
        }, executor);

        CompletableFuture<String> cf2 = cf1.thenApply((rs1) -> {
            System.out.println("waiting for cf1 : " + rs1);
            return "cf2 success";
        });
        tryComplete :

        System.out.println(cf2.get());
    }
}
