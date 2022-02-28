package org.lattice.java.lab.java8.lambda.strategy;

import cn.hutool.core.map.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/1/20 14:01
 */
@Service
public class QueryService {

    @Autowired
    StrategyTypeService strategyTypeService;
    @Autowired
    Function<String, String> function;

    private final Map<String, Function<String, String>> strategyMap = MapUtil.newHashMap();

    @PostConstruct
    private void init(){
        strategyMap.put("red_paper", reqId -> strategyTypeService.redPaper(reqId));
        strategyMap.put("coupon", reqId -> strategyTypeService.coupon(reqId));
        strategyMap.put("vip", reqId -> strategyTypeService.vip(reqId));
    }

    public String getResult(String reqId){
        Function<String, String> function = strategyMap.get(reqId);
        if(Objects.nonNull(function)){
            return function.apply(reqId);
        }
        return "查询不到优惠券规则";
    }


}
