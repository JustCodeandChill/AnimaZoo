package com.xxxx.Visiting.TicketService;

public abstract class Ticket {
    private String type;
    private double price;

    public Ticket() {
        this.type = "";
        this.price = 0;
    }

    public Ticket(String type) {
        this.type = type;
        this.price = 0;
    }

    public Ticket(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateTotalPrice();
}
