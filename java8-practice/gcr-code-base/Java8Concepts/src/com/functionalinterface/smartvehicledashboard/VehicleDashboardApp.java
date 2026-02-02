package com.functionalinterface.smartvehicledashboard;

//Main class to test smart vehicle dashboard
public class VehicleDashboardApp {

	public static void main(String[] args) {

		Vehicle petrolCar = new PetrolCar();
		Vehicle electricCar = new ElectricCar();

		petrolCar.displaySpeed();
		petrolCar.displayBattery(); // default method

		electricCar.displaySpeed();
		electricCar.displayBattery(); // overridden method
	}
}
