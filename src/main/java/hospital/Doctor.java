package hospital;

import interfaces.CanDrawBlood;

public class Doctor extends Employee implements CanDrawBlood {
	
	private String pay;
//	private String name;
//	private String title;
//	private String idNumber;
//	private int health;
//	private int bloodLevel;
	
	
	public String getPay() {
		return pay;
	}

//	public String getName() {
//		return name;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public String getIdNumber() {
//		return idNumber;
//	}
//
//	public int getHealth() {
//		return health;
//	}
//	
//	public int getBloodLevel() {
//		return bloodLevel;
//	}
	
	public Doctor(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$90,000.00";
//		this.name =name;
//		this.title = title;
//		this.idNumber = idNumber;
//		this.health = 10;
//		this.bloodLevel =10;
		}
	
	public void treatPatient(Patient patient) {
		patient.treatCurrentPatient(5);	
	}

	
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); //correlates to i in patient bloodlevel method (care for patient same)\
	}
}


//}

