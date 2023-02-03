package com.example.railwaytickets.model;

public class RailwayTicket {
    // задание полей сущности
    private String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private int distance;
    private float ticketPrice;
    private int numberOfTickets;

    //создание пустого конструктора
    public RailwayTicket() {
    }

    // создание конструктора исходных данных (стоимость билета, количество билетов)
    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice; // стоимость взрослого билета
        this.numberOfTickets = numberOfTickets; // количество билетов
    }

    // метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets; // нужно умножить количество билетов на стоимость одного билета
    }

 //создание геттеров и сеттеров
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}