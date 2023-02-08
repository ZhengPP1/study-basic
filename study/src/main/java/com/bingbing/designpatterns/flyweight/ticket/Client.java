package com.bingbing.designpatterns.flyweight.ticket;

/**
 * @author : bingbing
 */
public class Client {
    public static void main(String[] args) {
        ITicket ticket=TicketFactory.queryTicket("深圳","潮汕");
        ticket.showInfo("硬座");
        ITicket ticket1=TicketFactory.queryTicket("深圳","潮汕");
        ticket1.showInfo("硬座");
    }
}
