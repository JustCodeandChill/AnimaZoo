package com.xxxx.Visiting.TicketService;

import com.xxxx.Visiting.Visitor;

public class TicketService {
    TicketDAO ticketDAO;

    public TicketService() {
        ticketDAO = new TicketDAO();
    }

    public void addTicketToVisitor(Ticket ticket, Visitor visitor) {
        TicketRecord ticketRecord = new TicketRecord(visitor, ticket);
        ticketRecord.setTicket(ticket);
        ticketRecord.setVisitor(visitor);
        ticketDAO.add(ticketRecord);
    }

    public void getTicketTotalPrice() {

        for (TicketRecord record: ticketDAO.getTicketRecords()) {
            System.out.println(record.getVisitor() + "has " + record.getTicket().getType() + ";and ticket price is " + record.getTicket().calculateTotalPrice());
        }

    }

}
