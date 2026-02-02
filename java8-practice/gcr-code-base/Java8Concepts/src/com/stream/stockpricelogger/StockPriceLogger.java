package com.stream.stockpricelogger;

import java.util.*;

//Main class for stock price logging
public class StockPriceLogger {

	public static void main(String[] args) {

		// Live stock price feed
		List<Double> stockPrices = Arrays.asList(1520.50, 1532.75, 1518.20, 1540.00, 1528.90);

		// Displaying stock prices using forEach
		stockPrices.forEach(price -> System.out.println("Stock Price: ₹" + price));
	}
}
