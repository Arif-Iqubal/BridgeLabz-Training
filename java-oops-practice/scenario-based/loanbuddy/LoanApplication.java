package loanbuddy;

//Abstract base class for loan applications
abstract class LoanApplication implements IApprovable {

 protected String loanType;
 protected int term;            // Loan term in months
 protected double interestRate; // Annual interest rate
 protected Applicant applicant;

 // Loan status must be controlled internally
 private String loanStatus;

 // Constructor for loan application
 public LoanApplication(String loanType, int term, double interestRate, Applicant applicant) {
     this.loanType = loanType;
     this.term = term;
     this.interestRate = interestRate;
     this.applicant = applicant;
     this.loanStatus = "PENDING";
 }

 // Internal method to update loan status
 protected void setLoanStatus(String status) {
     this.loanStatus = status;
 }

 // Getter for loan status
 public String getLoanStatus() {
     return loanStatus;
 }

 // Basic approval logic (can be reused)
 @Override
 public void approveLoan() {

     // Approval rules
     if (applicant.getCreditScore() >= 650 &&
         applicant.getIncome() >= applicant.getLoanAmount() / 10) {

         setLoanStatus("APPROVED");
     } else {
         setLoanStatus("REJECTED");
     }
 }

 // Abstract EMI calculation (polymorphic)
 @Override
 public abstract double calculateEMI();
}
