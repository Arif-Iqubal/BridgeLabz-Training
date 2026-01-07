package loanbuddy;

//Personal Loan implementation
class PersonalLoan extends LoanApplication {

 public PersonalLoan(int term, Applicant applicant) {
     super("Personal Loan", term, 13.5, applicant); // Highest interest
 }

 @Override
 public double calculateEMI() {

     double P = applicant.getLoanAmount();
     double R = (interestRate / 12) / 100;
     int N = term;

     return (P * R * Math.pow(1 + R, N)) /
            (Math.pow(1 + R, N) - 1);
 }
}
