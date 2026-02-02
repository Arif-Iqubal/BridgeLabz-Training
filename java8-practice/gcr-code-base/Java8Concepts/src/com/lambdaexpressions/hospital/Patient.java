package com.lambdaexpressions.hospital;

//Model class for Patient
public class Patient {
 private String patientId;

 public Patient(String patientId) {
     this.patientId = patientId;
 }

 public String getPatientId() {
     return patientId;
 }
}
