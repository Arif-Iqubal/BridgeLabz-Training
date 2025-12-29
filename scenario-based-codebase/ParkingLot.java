import java.util.Scanner;

//Create class ParkingLot to compute and display available parking lots
public class ParkingLot {
	
	 
	//Creating a program to show occupancy of parking lot
	public static void displayParking(int parkingLot, int totalParkingLot){
		System.out.println(parkingLot + " are vacant out of " + totalParkingLot);
	}
	public static void main(String[] args) {
		
		//Initializing parking lots
		int totalParkingLot = 30;
		int parkingLot = totalParkingLot;
		boolean isExit = false;
		boolean isFull = false;
		
		
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Looping until user want to exit or parking lot full
		while(parkingLot >= 0){
			//Taking user input
			System.out.println("Enter operations\n 1 => Park\n 2 => Display occupency \n 3 => Exit ");
			int userInput = input.nextInt();
			
			
			//Performing operation based on user input
			switch (userInput){
				case 1:{
					if(parkingLot==0){
						isFull = true;
						break;
					}
					parkingLot--;
					System.out.println("Parked Successfully");
					break;
				}
				case 2:{
					ParkingLot.displayParking(parkingLot,totalParkingLot);
					break;
				}
				case 3:{
					isExit = true;
					break;
				}
				default:{
					System.out.println("Enter valid operation");
				}
			}
			if(isExit){
				System.out.println("Thank you for parking here");
				break;
			}
			if(isFull){
				System.out.println("Sorry all spots are full");
				break;
			}
			
			
		}
		
		input.close();
	}

}
