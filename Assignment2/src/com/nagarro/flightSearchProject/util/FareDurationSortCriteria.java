package com.nagarro.flightSearchProject.util;

import java.util.Comparator;

import com.nagarro.flightSearchProject.domain.Flight;
/**
 * this class overrides comparator to compare and sort flights by both fare and duration
 * @author surbhiagarwal
 *
 */
public class FareDurationSortCriteria implements Comparator<Flight> {

	@Override
	public int compare(Flight flight1, Flight flight2) {
		
		double result =  flight1.getFare() - flight2.getFare();
		if(0 == result) {
			result = flight1.getDuation().compareTo(flight2.getDuation());
		}
		return (int)result;
		
	}

}
