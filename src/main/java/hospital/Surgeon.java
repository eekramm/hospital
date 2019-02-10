package hospital;

import interfaces.CanDrawBlood;

public class Surgeon extends Doctor implements CanDrawBlood {
	
//	private int health;
	private String pay;
//	private String name;
//	private String title;
//	private String idNumber;
//	private int bloodLevel;

//	public int getHealth() {
//		return health;
//	}
	
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
	
	public Surgeon(String name, String title, String idNumber) {
		super(name, title, idNumber);		
		this.pay = "$120,000.00";
//		this.health = 10;
//		this.name = name;
//		this.title = title;
//		this.idNumber = idNumber;
//		this.bloodLevel = 10;
	}
	
//	public void treatPatient() {
//		health += 1;
//	}

	@Override
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(10);
	}
	
	public void performSurgery(Patient patient) {
		patient.performSurgery(1, 1);
	}
}
