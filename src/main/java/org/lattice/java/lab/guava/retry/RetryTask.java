package org.lattice.java.lab.guava.retry;

import cn.hutool.core.util.RandomUtil;
import com.github.rholder.retry.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @description: 重试任务
 * @author: Lattice
 * @date 2022/8/24 09:29
 */
@Slf4j
public class RetryTask {

    public static void main(String[] args) throws ExecutionException, RetryException {
        // 定义一个重试执行器
        Retryer<String> retry = RetryerBuilder.<String>newBuilder()
                .retryIfExceptionOfType(IllegalArgumentException.class)
                .retryIfResult(res -> res.equals("404"))
                .withWaitStrategy(WaitStrategies.fixedWait(2, TimeUnit.SECONDS))
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .build();
        // 执行目标方法
        String call = retry.call(RetryTask::requestProcessor);
        log.info(call);

    }

    public static String requestProcessor() {
        int ran = RandomUtil.randomInt(10);
        log.info("random number is {}...", ran);
        if (ran < 5 ) {
            throw new IllegalArgumentException("args is less than FIVE");
        }else if (ran < 6) {
            return "200";
        }else {
            return "404";
        }
    }

}
