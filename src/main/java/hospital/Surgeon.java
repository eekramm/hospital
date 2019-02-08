package hospital;

public class Surgeon {
	
	private int health;
	private String doctorPay;
	private String name;
	private String title;
	private String idNumber;
	private int bloodLevel;

	public int getHealth() {
		return health;
	}
	
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
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public Surgeon(String name, String title, String idNumber) {
		this.health = 10;
		this.doctorPay = "$120,000.00";
		this.name = name;
		this.title = title;
		this.idNumber = idNumber;
		this.bloodLevel = 10;
	}
	
	public void treatPatient() {
		health += 1;
	}

	public void drawBlood() {
		bloodLevel -=1;
	}
	
	public void performSurgery() {
		health -= 1;
	}
}
