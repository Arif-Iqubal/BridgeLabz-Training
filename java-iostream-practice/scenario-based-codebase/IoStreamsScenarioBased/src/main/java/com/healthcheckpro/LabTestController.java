package com.healthcheckpro;

public class LabTestController {

	@PublicAPI(description = "Fetch available lab tests")
	public void getAllTests() {
	}

	@RequiresAuth(role = "DOCTOR")
	public void addTestResult() {
	}

	// Missing annotation
	public void deleteTest() {
	}
}
