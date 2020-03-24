package com.nagarro.flightSearchProject.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.nagarro.flightSearchProject.domain.Flight;
import com.nagarro.flightSearchProject.dto.FlightSearchRequestDto;
/**
 * Interface
 * @author surbhiagarwal
 *
 */
public interface FlightSearchService {

	List<Flight> getAvailableFlights(FlightSearchRequestDto requestDTO) throws IOException, ParseException;
}
