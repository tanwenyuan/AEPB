package com.example.AEPB.model.parking;

import com.example.AEPB.model.car.Car;
import com.example.AEPB.model.ticket.Ticket;

import java.util.Optional;

public abstract class ParkingBoy {

    abstract Optional<Ticket> park(Car car);

    abstract Car pickUp(Ticket ticket);
}
