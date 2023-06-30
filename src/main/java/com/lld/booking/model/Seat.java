package com.lld.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class Seat {

    UUID id;
    int row,col;
}
