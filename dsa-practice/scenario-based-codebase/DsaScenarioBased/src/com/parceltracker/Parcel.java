package com.parceltracker;

//Parcel class to store stages of parcels
public class Parcel {
	String parcelStage;
	Parcel next;

	// Parameterized Constructor
	public Parcel(String parcelStage) {

		this.parcelStage = parcelStage;
		this.next = null;

	}

}
