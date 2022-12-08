package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repository.FlightRepository;
import com.example.airline_api.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.GregorianCalendar;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //BRITISH AIRWAYS
        Flight britishAirways = new Flight("London", 20, "8/12/2022", "08:00");
        flightRepository.save(britishAirways);







    }
}
