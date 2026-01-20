package com.movietime;

import java.time.LocalTime;

public class Show {
	//Instance of Class
		String name;
		LocalTime showTime;

		//Parameterized constructor
		public Show (String name, LocalTime showTime) {
			this.name = name;
			this.showTime = showTime;
		}
}
