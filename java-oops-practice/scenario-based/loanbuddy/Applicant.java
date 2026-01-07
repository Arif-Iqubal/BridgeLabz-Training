package loanbuddy;

//Class representing a loan applicant
class Applicant {

 private String name;        
 private int creditScore;      
 private double income;
 private double loanAmount;

 // Constructor
 public Applicant(String name, int creditScore, double income, double loanAmount) {
     this.name = name;
     this.creditScore = creditScore;
     this.income = income;
     this.loanAmount = loanAmount;
 }

 // Getter methods (no setters for safety)
 public String getName() {
     return name;
 }

 public int getCreditScore() {
     return creditScore;
 }

 public double getIncome() {
     return income;
 }

 public double getLoanAmount() {
     return loanAmount;
 }
}
