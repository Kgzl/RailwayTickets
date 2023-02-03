package com.example.railwaytickets.model;

public class RailwayTicketRetiree extends RailwayTicket {
    // создание пустого конструктора
    private float ticketDiscountRetiree;

    public RailwayTicketRetiree() {
    }
    // создание конструктора исходных данных пенсионерского билета
    public RailwayTicketRetiree(float ticketPrice, int numberOfTickets, float ticketDiscountRetiree) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscountRetiree = ticketDiscountRetiree;
    }
    // переопределение метода подсчёта стоимости пенсионерских билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountRetiree))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}
