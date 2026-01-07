package loanbuddy;


//Auto Loan implementation
class AutoLoan extends LoanApplication {

 public AutoLoan(int term, Applicant applicant) {
     super("Auto Loan", term, 10.5, applicant); // Higher interest rate
 }

 // EMI calculation for Auto Loan
 @Override
 public double calculateEMI() {

     double P = applicant.getLoanAmount();
     double R = (interestRate / 12) / 100;
     int N = term;

     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }
}

