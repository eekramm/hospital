package hospital;

public class Nurse {

	private String nursePay;
	private String name;
	private String title;
	private String idNumber;
	private int bloodLevel;
	private int hunger;
	private int organizationStatus;

	public String getPay() {
		return nursePay;
	}

	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHunger() {
		return hunger;
	}

	public int getOrganizationStatus() {
		return organizationStatus;
	}

	public Nurse(String name, String title, String idNumber) {
		this.nursePay = "$50,000.00";
		this.name = name;
		this.title = title;
		this.idNumber = idNumber;
		this.bloodLevel = 10;
		this.hunger = 5;
		this.organizationStatus = 5;
	}
	
	public void drawBlood ( ) {
		bloodLevel -= 1;
	}
	
	public void feed() {
		hunger = 10;
	}

	public void organize() {
		organizationStatus += 5;
	}

}

//	public void drawBlood(Patient patient) {
//		patient.drawSomeBlood(5); //correlates to i in patient bloodlevel method (care for patient same)
//	
//	}