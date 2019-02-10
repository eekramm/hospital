package hospital;

import java.util.HashMap;

public class Hospital {

	private int cleanliness;
	private int organization;

	public int getCleanliness() {
		return cleanliness;
	}

	public int getOrganization() {
		return organization;
	}
	
	public Hospital(int cleanliness, int organize) {
		this.cleanliness = cleanliness;
		this.organization = organize;
	}

	public void cleanliness(int cleanlinessAfterClean) {
		cleanliness += cleanlinessAfterClean;
	}
	
	public void organize (int OrganizationAfterOrganize) {
		organization += OrganizationAfterOrganize;
	}
	
	
	
	
	

	static HashMap<String, Patient> patientList = new HashMap<String, Patient>();
	static HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

	public void addPatient(Patient patient) {
		patientList.put(patient.getIdNumber(), patient);
	}
}
