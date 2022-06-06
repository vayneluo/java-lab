package org.lattice.java.lab.core.proxy.dynamic;

/**
 * @description: 委托对象
 * @author: Lattice
 * @date 2022/3/3 10:09
 */
public class BuyerTicketServiceImpl implements BuyTicketService {


    @Override
    public String buyTicket() {
        System.out.println("输入账号，购买火车票");
        return "购买成功，订单号为xxx";
    }
}
