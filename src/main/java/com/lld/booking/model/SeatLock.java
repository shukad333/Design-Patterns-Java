package com.lld.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@Getter
public class SeatLock {

    private Seat seat;
    private Screen screen;
    private Date lockTime;
    private String lockedBy;
    private Integer timeOut;


    public boolean isLocked() {
        final Instant instant = lockTime.toInstant().plusSeconds(timeOut);
        final Instant currInstant = new Date().toInstant();

        return currInstant.isBefore(instant);
    }

}
