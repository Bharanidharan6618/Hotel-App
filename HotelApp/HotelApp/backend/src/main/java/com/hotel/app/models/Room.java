package com.hotel.app.models;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "rooms")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;
    private String type; // Single, Double, Suite
    private Double price;
    private String status; // Available, Occupied, Maintenance
}
