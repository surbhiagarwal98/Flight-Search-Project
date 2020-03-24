package com.nagarro.flightSearchProject.util;

/**
 * this class increments fare by 40% for business class
 * 
 * @author surbhiagarwal
 *
 */
public class FareIncrementService {
	public double incrementFare(double fare) {
		fare = fare + (40 * fare) / 100;
		return fare;
	}
}
