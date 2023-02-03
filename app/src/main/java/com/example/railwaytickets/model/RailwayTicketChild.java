package com.example.railwaytickets.model;

public class RailwayTicketChild extends RailwayTicket{
    private float ticketDiscount;
    // создание пустого конструктора
    public RailwayTicketChild() {
    }
    // создание конструктора исходных данных детского билета
    public RailwayTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    // переопределение метода подсчёта стоимости детских билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}
