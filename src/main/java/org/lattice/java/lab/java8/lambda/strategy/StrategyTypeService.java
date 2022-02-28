package org.lattice.java.lab.java8.lambda.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @description: 策略类型服务
 * @author: Lattice
 * @date 2022/1/20 14:01
 */
@Service
public class StrategyTypeService {


    @Bean
    public String redPaper(String reqId){
        return "每周末9点发放";
    }

    public String coupon(String reqId){
        return "每周三9点发放";
    }

    public String vip(String reqId){
        return "每周一0点开始秒杀";
    }

}
