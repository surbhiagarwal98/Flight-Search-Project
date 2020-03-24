package com.nagarro.flightSearchProject.dao;

import java.io.IOException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.nagarro.flightSearchProject.domain.Flight;
import com.nagarro.flightSearchProject.domain.FlightClass;

public class FlightDaoImp implements FlightDao {

	String[] fileList = {
			"C:\\Users\\surbhiagarwal\\Desktop\\Training@Nagarro\\4Advanced Java\\Assignment Links\\Assignment Links\\AirIndia.csv",
			"C:\\Users\\surbhiagarwal\\Desktop\\Training@Nagarro\\4Advanced Java\\Assignment Links\\Assignment Links\\indigo.csv",
			"C:\\Users\\surbhiagarwal\\Desktop\\Training@Nagarro\\4Advanced Java\\Assignment Links\\Assignment Links\\JetAir.csv" };

	String line = "";

	@Override
	public List<Flight> getFlights() throws IOException, ParseException {
		List<Flight> flightList = new ArrayList<>();

		for (String file : fileList) {

			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				br.readLine();

				while ((line = br.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(line, "|");
					Flight flight = new Flight();
					try {
						flight.setFlightNo(st.nextToken());

						flight.setDepartureLoc(st.nextToken());

						flight.setArrivalLoc(st.nextToken());

						try {
							DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
							flight.setDate(dateformat.parse(st.nextToken()));
						} catch (ParseException e) {
							System.out.println("Couldn't parse date");
						}

						flight.setTime(st.nextToken());

						flight.setDuation(st.nextToken());

						flight.setFare(Double.parseDouble(st.nextToken()));

						flight.setSeatAvailability(st.nextToken());

						flight.setFlightClass(FlightClass.valueOf(st.nextToken()));
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Array out of bounds");
					}

					flightList.add(flight);

				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
		}

		return flightList;
	}

}
