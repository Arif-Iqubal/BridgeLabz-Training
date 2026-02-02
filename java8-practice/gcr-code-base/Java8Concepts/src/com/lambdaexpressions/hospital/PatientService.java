package com.lambdaexpressions.hospital;

import java.util.List;

//Service class for printing patient IDs
public class PatientService {

 public static void printPatientId(Patient patient) {
     System.out.println(patient.getPatientId());
 }

 public static void printAllPatientIds(List<Patient> patients) {
     patients.forEach(PatientService::printPatientId); // method reference
 }
}
