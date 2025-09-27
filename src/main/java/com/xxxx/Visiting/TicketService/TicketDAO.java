package com.xxxx.Visiting.TicketService;

import com.xxxx.Visiting.Visitor;

import java.util.HashSet;
import java.util.Set;

public class TicketDAO {
    Set<TicketRecord> ticketRecords;

    public TicketDAO() {
        ticketRecords = new HashSet<>();
    }

    public void add(TicketRecord ticketRecord) {
        ticketRecords.add(ticketRecord);
    }

    public Set<TicketRecord> getTicketRecords() {
        return ticketRecords;
    }

    public void setTicketRecords(Set<TicketRecord> ticketRecords) {
        this.ticketRecords = ticketRecords;
    }
}
