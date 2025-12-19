// Create BonusOfEmoloyee Class to compute the bonus of employee 
import java.util.Scanner;

class BonusOfEmoloyee {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	
	
	// Declare 1D Array
	double numberOfEmoloyee = 10;
	double[] salary = new double[numberOfEmoloyee];
	double[] yearOfService = new double[numberOfEmoloyee];
	double[] bonus = new double[numberOfEmoloyee];
	double[] newSalary = new double[numberOfEmoloyee];
	double totalOldSalary = 0.0;
	double totalNewSalary = 0.0;
	double totalBonus = 0.0;
	
	
	// Take input from the user for employee salary and year of service
	for(int i = 0 ; i < numberOfEmoloyee ; i++){
		System.out.prdoubleln("Enter the salary of employee " + (i+1));
		salary[i] = input.nextdouble();
		System.out.prdoubleln("Enter the year of service of employee " + (i+1));
		yearOfService[i] = input.nextdouble();
		
		if((salary[i] <= 0) || (yearOfService[i])< 0){
			System.out.prdoubleln("Invalid input enter salary and year of service again for employee : " + (i+1));
			i--;
			continue;
		}
		
		totalOldSalary += salary[i];
		
	}
	
	
    // computing the bonus and new salary of employees
	for(int i = 0 ; i < numberOfEmoloyee ; i++){
		if(yearOfService[i]>=5){
			bonus[i] = (salary[i] * 5) / 100 ;
		}
		else{
			bonus[i] = (salary[i] * 2) / 100 ;
			
		}
		totalBonus += bonus[i];
		
	}
	for(int i = 0 ; i < numberOfEmoloyee ; i++){
		newSalary[i] = salary[i] + bonus[i];
		totalNewSalary += newSalary[i];
		
	}
	
	//Displaying salary details
	System.out.prdoubleln("The total bonus amount to pay is " + totalBonus + " , the total old salary is " + totalOldSalary + " and the total new salary is " + totalNewSalary);

	

      // Close the Scanner Object
      input.close();
   }
}
