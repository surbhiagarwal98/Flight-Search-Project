package com.nagarro.flightSearchProject.dto;

import java.util.Date;

import com.nagarro.flightSearchProject.domain.FlightClass;
import com.nagarro.flightSearchProject.domain.OutputPreferences;

public class FlightSearchRequestDto {

	private String depLocation;
	
	private String arrLocation;
	
	private Date travelDate;

	private FlightClass flightClass;
	
	private OutputPreferences outputPreference;

	public FlightSearchRequestDto(String depLocation, String arrLocation, Date travelDate, FlightClass flightClass,
			OutputPreferences outputPreference) {
		super();
		this.depLocation = depLocation;
		this.arrLocation = arrLocation;
		this.travelDate = travelDate;
		this.flightClass = flightClass;
		this.outputPreference = outputPreference;
	}

	public FlightSearchRequestDto() {

	}

	public String getDepLocation() {
		return depLocation;
	}

	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}

	public String getArrLocation() {
		return arrLocation;
	}

	public void setArrLocation(String arrLocation) {
		this.arrLocation = arrLocation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public FlightClass getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(FlightClass flightClass) {
		this.flightClass = flightClass;
	}

	public OutputPreferences getOutputPreference() {
		return outputPreference;
	}

	public void setOutputPreference(OutputPreferences outputPreference) {
		this.outputPreference = outputPreference;
	}
}
