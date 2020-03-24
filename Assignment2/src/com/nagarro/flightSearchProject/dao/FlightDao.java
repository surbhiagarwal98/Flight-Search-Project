package com.nagarro.flightSearchProject.dao;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.nagarro.flightSearchProject.domain.Flight;

/**
 * 
 * @author surbhiagarwal Interface
 */
public interface FlightDao {

	List<Flight> getFlights() throws IOException, ParseException;
}
