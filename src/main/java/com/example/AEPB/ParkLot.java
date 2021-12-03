package com.example.AEPB;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class ParkLot {
    private int numberOfParkLog;

    private int remainNumber;


    public boolean hasParkSpace() {
        return remainNumber > 0 && remainNumber < numberOfParkLog;
    }

    public boolean hasGetPark() {
        return remainNumber < numberOfParkLog;
    }

    public boolean hasGetParkFailed() {
        return remainNumber == 0;
    }
}
