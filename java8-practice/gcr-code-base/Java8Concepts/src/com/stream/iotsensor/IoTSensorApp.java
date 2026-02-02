package com.stream.iotsensor;

import java.util.*;
import java.util.stream.Stream;

// Main class for IoT sensor readings
public class IoTSensorApp {

	public static void main(String[] args) {

		// Sensor readings from IoT devices
		List<Double> sensorReadings = Arrays.asList(22.5, 30.1, 18.9, 35.6, 27.4);

		double threshold = 25.0;

		// Printing readings above threshold using streams
		sensorReadings.stream().filter(reading -> reading > threshold)
				.forEach(reading -> System.out.println("High Reading: " + reading));
	}
}
