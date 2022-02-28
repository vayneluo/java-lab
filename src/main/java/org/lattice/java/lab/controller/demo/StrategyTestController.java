package org.lattice.java.lab.controller.demo;

import org.lattice.java.lab.java8.lambda.strategy.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/1/20 14:12
 */
@RestController
public class StrategyTestController {

    @Autowired
    QueryService queryService;

    @GetMapping(value = "/rules/{reqId}")
    public String query(@PathVariable(value = "reqId") String reqId){
        return queryService.getResult(reqId);
    }

}
