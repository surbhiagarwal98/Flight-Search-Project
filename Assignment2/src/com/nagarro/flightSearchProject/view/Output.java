package com.nagarro.flightSearchProject.view;

import java.util.List;

import com.nagarro.flightSearchProject.domain.Flight;

/**
 * displays the output
 * 
 * @author surbhiagarwal
 *
 */
public class Output {
	public void display(List<Flight> availableFlights) {
		for (Flight flight : availableFlights) {
			System.out.println("Flight number: " + flight.getFlightNo() + " | Arrival location: "
					+ flight.getArrivalLoc() + " | Departure location: " + flight.getDepartureLoc() + " | Date: "
					+ flight.getDate() + " | Flight Duration: " + flight.getDuation() + " | Flight time: "
					+ flight.getTime() + " | Fare :" + flight.getFare() + " | Flight class: " + flight.getFlightClass()
					+ " | Seat avilability: " + flight.getSeatAvailability());
		}

	}
}
