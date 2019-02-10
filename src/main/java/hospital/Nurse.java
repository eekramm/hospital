package hospital;

import interfaces.CanDrawBlood;
import interfaces.CanOrganize;

public class Nurse extends Employee implements CanOrganize, CanDrawBlood {

	private String pay;
//	private String name;
//	private String title;
//	private String idNumber;
//	private int bloodLevel;
//	private int hunger;
	private int organizationStatus;

	public String getPay() {
		return pay;
	}

//	public String getName() {
//		return name;
//	}

//	public String getTitle() {
//		return title;
//	}

//	public String getIdNumber() {
//		return idNumber;
//	}

//	public int getBloodLevel() {
//		return bloodLevel;
//	}

//	public int getHunger() {
//		return hunger;
//	}

	public int getOrganizationStatus() {
		return organizationStatus;
	}

	public Nurse(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$50,000.00";
//		this.name = name;
//		this.title = title;
//		this.idNumber = idNumber;
//		this.bloodLevel = 10;
//		this.hunger = 5;
		this.organizationStatus = 5;
	}
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); //correlates to i in patient bloodlevel method (care for patient same)\
	}
//	public void drawBlood ( ) { -- this was line 54
//		bloodLevel -= 1;
//	}
	
	public void feed(Patient patient) {
		patient.satisfyHunger(10);
	}
	
	public void organize(Hospital hospital) {
		hospital.organize(5);
	}
}

//	public void drawBlood(Patient patient) {
//		patient.drawSomeBlood(5); //correlates to i in patient bloodlevel method (care for patient same)
//	
//	}