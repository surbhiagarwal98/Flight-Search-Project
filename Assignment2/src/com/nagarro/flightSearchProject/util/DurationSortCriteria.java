package com.nagarro.flightSearchProject.util;

import java.util.Comparator;

import com.nagarro.flightSearchProject.domain.Flight;

/**
 * this class overrides comparator method to compare&sort flight durations
 * 
 * @author surbhiagarwal
 *
 */
public class DurationSortCriteria implements Comparator<Flight> {

	@Override
	public int compare(Flight flight1, Flight flight2) {

		return flight1.getDuation().compareTo(flight2.getDuation());
	}

}
