package com.nagarro.flightSearchProject.util;

import java.util.Comparator;

import com.nagarro.flightSearchProject.domain.Flight;

/**
 * this class overrides comparator method to compare and sort flights by fare
 * 
 * @author surbhiagarwal
 *
 */
public class FareSortCriteria implements Comparator<Flight> {

	@Override
	public int compare(Flight flight1, Flight flight2) {

		return (int) (flight1.getFare() - flight2.getFare());
	}

}
