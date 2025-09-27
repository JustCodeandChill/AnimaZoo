package com.xxxx.Visiting.TicketService;

import com.xxxx.Visiting.Visitor;

import java.util.Random;

public class TicketRecord {
    private Ticket ticket;
    private Visitor visitor;
    private int id;

    public TicketRecord() {
    }

    public TicketRecord( Visitor visitor, Ticket ticket) {
        this.ticket = ticket;
        this.visitor = visitor;
        this.id = new Random().nextInt(1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
