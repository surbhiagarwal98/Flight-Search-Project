package com.nagarro.flightSearchProject.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nagarro.flightSearchProject.domain.FlightClass;
import com.nagarro.flightSearchProject.domain.OutputPreferences;
import com.nagarro.flightSearchProject.exception.InvalidInputException;

/**
 * this class validated inputs as per their formats and datatypes
 * 
 * @author surbhiagarwal
 *
 */
public class ValidationUtil {
	/**
	 * returns validated class,if can not,throws custom exception
	 * 
	 * @param type
	 * @return
	 * @throws InvalidInputException
	 */
	public static FlightClass getValidatedClass(final String type) throws InvalidInputException {
		FlightClass validatedClass = null;
		if (null != type) {
			try {
				validatedClass = FlightClass.valueOf(type);
			} catch (IllegalArgumentException exception) {
				throw new InvalidInputException("Invalid input");
			}
		} else {
			throw new InvalidInputException("Invalid input.");
		}
		return validatedClass;
	}

	/**
	 * returns validated output preference,if can not,throws custom exception
	 * 
	 * @param pref
	 * @return
	 * @throws InvalidInputException
	 */
	public static OutputPreferences getValidatedPref(final String pref) throws InvalidInputException {
		OutputPreferences validatedPref = null;
		if (null != pref) {
			try {
				validatedPref = OutputPreferences.valueOf(pref);
			} catch (IllegalArgumentException exception) {
				throw new InvalidInputException("Invalid input");
			}
		} else {
			throw new InvalidInputException("Invalid input.");
		}
		return validatedPref;
	}

	/**
	 * returns validated date,if can not,throws custom exception
	 * 
	 * @param date
	 * @return
	 * @throws InvalidInputException
	 */
	public static Date getValidatedDate(final String date) throws InvalidInputException {
		DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date validatedDate = null;
		if (null != date) {
			try {
				validatedDate = dateformat.parse(date);
			} catch (ParseException exception) {
				throw new InvalidInputException("Invalid Input");
			}
		} else {
			throw new InvalidInputException("Invalid input");
		}
		return validatedDate;
	}
}
