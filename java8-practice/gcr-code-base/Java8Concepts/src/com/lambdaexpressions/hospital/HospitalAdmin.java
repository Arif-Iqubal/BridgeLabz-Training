package com.lambdaexpressions.hospital;

import java.util.*;

//Main class
public class HospitalAdmin {

 public static void main(String[] args) {

     // List of patients
     List<Patient> patients = Arrays.asList(
             new Patient("PID101"),
             new Patient("PID102"),
             new Patient("PID103"),
             new Patient("PID104")
     );

     // Printing all patient IDs using method reference
     PatientService.printAllPatientIds(patients);
 }
}
