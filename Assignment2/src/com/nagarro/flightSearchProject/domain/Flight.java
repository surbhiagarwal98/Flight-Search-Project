package com.nagarro.flightSearchProject.domain;


import java.util.Date;
/**
 * class including all details of flight
 * @author surbhiagarwal
 * 
 */
public class Flight {
	private String flightNo;
	private String arrivalLoc;
	private String departureLoc;
	private Date date;
	private String time;
	private String duation;
	private double fare;
	private String seatAvailability;
	private FlightClass flightClass;
	
	public Flight() {
	}
	/**
	 * constructor
	 * @param flightNo
	 * @param arrivalLoc
	 * @param departureLoc
	 * @param date
	 * @param time
	 * @param duation
	 * @param fare
	 * @param seatAvailability
	 * @param flightClass
	 */
	public Flight(String flightNo, String arrivalLoc, String departureLoc, Date date, String time, String duation,
			double fare, String seatAvailability, FlightClass flightClass) {
		super();
		this.flightNo = flightNo;
		this.arrivalLoc = arrivalLoc;
		this.departureLoc = departureLoc;
		this.date = date;
		this.time = time;
		this.duation = duation;
		this.fare = fare;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
	}
	

	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getArrivalLoc() {
		return arrivalLoc;
	}
	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}
	public String getDepartureLoc() {
		return departureLoc;
	}
	public void setDepartureLoc(String departureLoc) {
		this.departureLoc = departureLoc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDuation() {
		return duation;
	}
	public void setDuation(String duation) {
		this.duation = duation;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double d) {
		this.fare = d;
	}
	public String getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public FlightClass getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(FlightClass flightClass) {
		this.flightClass = flightClass;
	}
	
	
	
}
