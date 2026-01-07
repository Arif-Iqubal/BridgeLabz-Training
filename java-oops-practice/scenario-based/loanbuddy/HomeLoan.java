package loanbuddy;

//Home Loan implementation
class HomeLoan extends LoanApplication {

 public HomeLoan(int term, Applicant applicant) {
     super("Home Loan", term, 8.5, applicant); // Lower interest rate
 }

 // EMI calculation for Home Loan
 @Override
 public double calculateEMI() {

     double P = applicant.getLoanAmount();
     double R = (interestRate / 12) / 100; // Monthly interest
     int N = term;

     // EMI formula using operators
     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }
}
