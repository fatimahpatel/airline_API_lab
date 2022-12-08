package com.example.airline_api.controllers;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    // Display details of all passengers
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        return new ResponseEntity<>(passengerRepository.findAll(), HttpStatus.OK);
    }

    // Display specific passenger details
    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(){
        return null;
    }

    // Add a new passenger
    @PostMapping
    public ResponseEntity<Passenger> addNewPassenger(){
        return null;
    }

}
