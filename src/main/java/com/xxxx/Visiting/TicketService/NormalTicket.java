package com.xxxx.Visiting.TicketService;

public class NormalTicket extends Ticket{
    public NormalTicket() {
        super("Normal Ticket (cant feed animal)", 5.0);
    }

    @Override
    public double calculateTotalPrice() {
        return super.getPrice();
    }
}
