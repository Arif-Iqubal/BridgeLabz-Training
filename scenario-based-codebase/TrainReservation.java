import java.util.Scanner;

//Create class TrainReservation to compute and display available train seats
public class TrainReservation {
	
	 
	//Creating a program to show seats in train
	public static void displaySeats(int TrainReservation, int totalSeatAvailable){
		System.out.println("-----------------------------------------");
		System.out.println(TrainReservation + " Seats are available out of " + totalSeatAvailable);
		System.out.println("-----------------------------------------");

	}
	public static void main(String[] args) {
		
		//Initializing parking lots
		int totalSeatAvailable = 30;
		int availableSeats = totalSeatAvailable;
		boolean isExit = false;
		boolean isFull = false;
		
		
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Looping until user want to exit
		while(availableSeats >= 0){
			//Taking user input
			System.out.println("Enter operations\n 1 => Book Ticket\n 2 => Display Seat Availibility \n 3 => Exit ");
			int userInput = input.nextInt();
			
			
			//Performing operation based on user input
			switch (userInput){
				case 1:{
					if(availableSeats==0){
						isFull = true;
						break;
					}
					availableSeats--;
					System.out.println("-----------------------------------------");
					System.out.println("Seat booked Successfully");
					System.out.println("-----------------------------------------");

					break;
				}
				case 2:{
					TrainReservation.displaySeats(availableSeats,totalSeatAvailable);
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
				System.out.println("Thank you for Booking seats");
				break;
			}
			if(isFull){
				System.out.println("Sorry all seats are full");
				break;
			}
			
			
		}
		
		input.close();
	}

}
