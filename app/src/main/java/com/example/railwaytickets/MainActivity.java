package com.example.railwaytickets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.railwaytickets.model.RailwayTicket;
import com.example.railwaytickets.model.RailwayTicketChild;
import com.example.railwaytickets.model.RailwayTicketRetiree;

public class MainActivity extends AppCompatActivity {
    // создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    // создание объекта сущности детских билетов (стоимость билета, количество билетов, скидка)
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);
    // создание объекта сущности пенсионерских билетов (стоимость билета, количество билетов, скидка)
    RailwayTicket railwayTicketRetiree = new RailwayTicketRetiree(70, 5, 30);

    private TextView railwayTicketTotalOut; // поле вывода общей стоимости всех билетов

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваивание переменным активити элементов представления activity_main
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut); // вывод информации стоимости всех билетов

        // заполнение поля стоимостью всех билетов
        railwayTicketTotalOut.setText(Float.toString((railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll()) + railwayTicketRetiree.ticketPriceAll()) + " монет");

    }
}
