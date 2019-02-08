package hospital;

public class Doctor {
	
	private String doctorPay;
	private String name;
	private String title;
	private String idNumber;
	private int health;
	private int bloodLevel;
	
	
	public String getPay() {
		return doctorPay;
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

	public int getHealth() {
		return health;
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public Doctor(String name, String title, String idNumber) {
		this.doctorPay = "$90,000.00";
		this.name =name;
		this.title = title;
		this.idNumber = idNumber;
		this.health = 10;
		this.bloodLevel =10;
		}
	
	public void treatPatient() {
		health += 1;
		
	}


	public void drawBlood() {
		bloodLevel -= 1;
	}

}
