package org.lattice.java.lab.core.proxy.staticproxy;

/**
 * @description: 代理对象
 * @author: Lattice
 * @date 2022/3/3 09:58
 */
public class BuyTicketProxy implements StaticBuyTicketService {

    private StaticBuyTicketServiceImpl buyTicketService;

    public BuyTicketProxy(StaticBuyTicketServiceImpl buyTicketService) {
        this.buyTicketService = buyTicketService;
    }

    @Override
    public String buyTicket() {
        System.out.println("携程代理购买，收取手续费2元");
        String ticket = buyTicketService.buyTicket();
        System.out.println("发送通知，购买成功");
        return ticket;
    }

    public static void main(String[] args) {
        StaticBuyTicketService proxy = new BuyTicketProxy(new StaticBuyTicketServiceImpl());
        proxy.buyTicket();
    }
}
