package hospital;

import interfaces.CanDrawBlood;

public class VampireJanitor extends Janitor implements CanDrawBlood {

	private String pay;
//	private String name;
//	private String title;
//	private String idNumber;
//	private int cleanliness;
//	private int bloodLevel;

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

//	public int getCleanliness() {
//		return cleanliness;
//	}

//	public int getBloodLevel() {
//		return bloodLevel;
//	}

	public VampireJanitor(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$40,000.00";
//		this.name = name;
//		this.title = "Vampire Janitor";
//		this.idNumber = idNumber;
//		this.cleanliness = 10;
//		this.bloodLevel = 20;
	}

	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); // correlates to i in patient bloodlevel method (care for patient same)\
	}

}
