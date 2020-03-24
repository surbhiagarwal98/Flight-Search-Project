package com.nagarro.flightSearchProject.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.nagarro.flightSearchProject.domain.Flight;
import com.nagarro.flightSearchProject.dto.FlightSearchRequestDto;
import com.nagarro.flightSearchProject.service.FlightSearchServiceImp;
import com.nagarro.flightSearchProject.view.Input;
import com.nagarro.flightSearchProject.view.Output;
/**
 * 
 * @author surbhiagarwal
 * Main method class
 */
public class Application {
	public static void main(String[] args) throws IOException, ParseException {

	FlightSearchRequestDto requestDTO = new Input().getFlightCriteria();
		
		List<Flight> availableFlights = new FlightSearchServiceImp().getAvailableFlights(requestDTO);
		
		new Output().display(availableFlights);
		
		
	}
}
