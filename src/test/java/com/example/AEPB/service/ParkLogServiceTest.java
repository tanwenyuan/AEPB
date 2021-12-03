package com.example.AEPB.service;

import com.example.AEPB.ParkLot;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

@SpringBootTest
public class ParkLogServiceTest {

    @Test
    public void should_parking_lot_given_park_space_success() {
        // given
        ParkLot parkLot = new ParkLot(10, 5);

        // then
        Assert.assertTrue(parkLot.hasParkSpace());
    }


    @Test
    public void should_get_parking_success_is_not_space() {
        // given
        ParkLot parkLot = new ParkLot(10, 5);

        // then
        Assert.assertTrue(parkLot.hasGetPark());

    }
    @Test
    public void should_get_parking_failed_is_empty() {
        // given
        ParkLot parkLot = new ParkLot(10,0);

        // then
        Assert.assertTrue(parkLot.hasGetParkFailed());
    }

}
