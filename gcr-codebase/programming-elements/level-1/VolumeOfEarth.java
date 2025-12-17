//Creating a class name VolumeOfEarth and displaying the volume of earth

public class VolumeOfEarth{

	public static void main(String[] args){
	
	// Creating a constant double variable and storing the value of PI
	final double PI = 3.14;
	
	// Creating a integer variable and storing the radius of earth in kilometers
	int radiusOfEarth = 6378;
	
	//Calulating the volume of earth in kilometers
	double volumeOfEarth = ( 4 / 3 ) * PI * (radiusOfEarth * radiusOfEarth * radiusOfEarth) ;
	
	//Converting the volume of earth from kilometers to miles
	double volumeInMiles = volumeOfEarth * 0.621372 ;
	
	// displaying the volume of earth in kilometers and miles
	System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarth + " and cubic miles is " + volumeInMiles);
	
	
	
	
	
	}




} 