package com.nagarro.flightSearchProject.service;

import java.io.IOException;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.nagarro.flightSearchProject.dao.FlightDao;
import com.nagarro.flightSearchProject.dao.FlightDaoImp;
import com.nagarro.flightSearchProject.domain.Flight;
import com.nagarro.flightSearchProject.domain.FlightClass;
import com.nagarro.flightSearchProject.domain.OutputPreferences;
import com.nagarro.flightSearchProject.dto.FlightSearchRequestDto;
import com.nagarro.flightSearchProject.util.DurationSortCriteria;
import com.nagarro.flightSearchProject.util.FareDurationSortCriteria;
import com.nagarro.flightSearchProject.util.FareIncrementService;
import com.nagarro.flightSearchProject.util.FareSortCriteria;

/**
 * 
 * @author surbhiagarwal
 *
 */
public class FlightSearchServiceImp implements FlightSearchService {

	@Override
	public List<Flight> getAvailableFlights(FlightSearchRequestDto requestDTO) throws IOException, ParseException {

		String requestedArrLoc = requestDTO.getArrLocation();
		String requestedDepLoc = requestDTO.getDepLocation();
		Date requestedDate = requestDTO.getTravelDate();
		FlightClass requestedClass = requestDTO.getFlightClass();
		OutputPreferences requestedPref = requestDTO.getOutputPreference();

		FlightDao flightDao = new FlightDaoImp();
		List<Flight> flightList = flightDao.getFlights();
		List<Flight> filteredFlights = new ArrayList<>();

		for (Flight flight : flightList) {
			if (flight.getArrivalLoc().equals(requestedArrLoc) && flight.getDepartureLoc().equals(requestedDepLoc)
					&& flight.getDate().equals(requestedDate) && (flight.getFlightClass() == requestedClass
							|| flight.getFlightClass() == FlightClass.valueOf("EB"))) {

				filteredFlights.add(flight);
			}
		}

		for (Flight flight : filteredFlights) {
			if (requestedClass == FlightClass.valueOf("EB") && (flight.getFlightClass() == FlightClass.valueOf("EB"))
					|| (flight.getFlightClass() == FlightClass.valueOf("B"))) {
				flight.setFare(new FareIncrementService().incrementFare(flight.getFare()));
			}
		}
		switch (requestedPref) {

		case FARE:
			Collections.sort(filteredFlights, new FareSortCriteria());
			break;
		case DURATION:
			Collections.sort(filteredFlights, new DurationSortCriteria());
			break;
		case BOTH:
			Collections.sort(filteredFlights, new FareDurationSortCriteria());
			break;
		default:

		}

		return filteredFlights;
	}

}
