package loanbuddy;

//Main class to test LoanBuddy engine
public class LoanBuddyApp {

 public static void main(String[] args) {

     // Create applicant
     Applicant applicant = new Applicant(
             "Arif Iqubal",
             720,
             60000,
             500000
     );

     // Create loan applications
     LoanApplication homeLoan = new HomeLoan(240, applicant); // 20 years
     LoanApplication autoLoan = new AutoLoan(60, applicant);  // 5 years

     // Process Home Loan
     homeLoan.approveLoan();
     System.out.println("Loan Type: Home Loan");
     System.out.println("Status: " + homeLoan.getLoanStatus());
     System.out.println("Monthly EMI: ₹" + Math.round(homeLoan.calculateEMI()));

     System.out.println();

     // Process Auto Loan
     autoLoan.approveLoan();
     System.out.println("Loan Type: Auto Loan");
     System.out.println("Status: " + autoLoan.getLoanStatus());
     System.out.println("Monthly EMI: ₹" + Math.round(autoLoan.calculateEMI()));
 }
}
