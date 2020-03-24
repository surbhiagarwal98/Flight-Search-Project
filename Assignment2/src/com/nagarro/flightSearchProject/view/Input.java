package com.nagarro.flightSearchProject.view;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.nagarro.flightSearchProject.domain.FlightClass;
import com.nagarro.flightSearchProject.domain.OutputPreferences;
import com.nagarro.flightSearchProject.dto.FlightSearchRequestDto;
import com.nagarro.flightSearchProject.exception.InvalidInputException;
import com.nagarro.flightSearchProject.util.ValidationUtil;

/**
 * this class takes input,sets the flight values and return requestDTO object
 * 
 * @author surbhiagarwal
 *
 */
public class Input {
	Scanner sc = new Scanner(System.in);

	public FlightSearchRequestDto getFlightCriteria() throws ParseException, IOException {

		FlightSearchRequestDto requestDTO = new FlightSearchRequestDto();

		requestDTO.setArrLocation(getArrivalLoc());
		requestDTO.setDepLocation(getDepartureLoc());
		requestDTO.setTravelDate(getDate());
		requestDTO.setFlightClass(getFlightClass());
		requestDTO.setOutputPreference(getOutputPref());

		return requestDTO;
	}

	/**
	 * returns user entered arrival location
	 * 
	 * @return
	 */
	public String getArrivalLoc() {
		System.out.println("Enter arrival location:");
		String arrivalLoc = sc.next().toUpperCase();
		return arrivalLoc;
	}

	/**
	 * returns user entered departure location
	 * 
	 * @return
	 */
	public String getDepartureLoc() {
		System.out.println("Enter Departure location:");

		String departureLoc = sc.next().toUpperCase();
		return departureLoc;
	}

	/**
	 * takes user input for date,validates it and returns validated date
	 * 
	 * @return
	 * 
	 */
	public Date getDate() {
		Date validatedDate = null;
		while (true) {
			try {
				System.out.println("Enter Date of Travel(dd-MM-yyyy):");
				String inputDate = sc.next();
				validatedDate = ValidationUtil.getValidatedDate(inputDate);
				break;
			} catch (InvalidInputException exception) {
				System.out.println(exception.getMessage());
			}
		}
		return validatedDate;
	}

	/**
	 * takes user input for flight class,validates it and returns validated flight
	 * class
	 * 
	 * @return
	 */
	public FlightClass getFlightClass() {
		FlightClass validatedClass = null;
		while (true) {
			try {
				System.out.println("Enter Flight class(Type E/B/EB): ");
				String inputClass = (sc.next()).toUpperCase();
				validatedClass = ValidationUtil.getValidatedClass(inputClass);
				break;
			} catch (InvalidInputException exception) {
				System.out.println(exception.getMessage());
			}
		}
		return validatedClass;

	}

	/**
	 * takes user input for ouput preference,validates it and returns validated
	 * output preference
	 * 
	 * @return
	 */
	public OutputPreferences getOutputPref() {
		OutputPreferences validatedPref = null;
		while (true) {
			try {
				System.out.println("Enter Output Preference(Type Fare/Duration/Both): ");
				String inputPref = (sc.next()).toUpperCase();
				validatedPref = ValidationUtil.getValidatedPref(inputPref);
				break;
			} catch (InvalidInputException exception) {
				System.out.println(exception.getMessage());
			}
		}
		return validatedPref;
	}

}
