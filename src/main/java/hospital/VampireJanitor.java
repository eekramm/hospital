package hospital;

public class VampireJanitor {

	private String pay;
	private String name;
	private String title;
	private String idNumber;
	private int cleanliness;
	private int bloodLevel;

	public String getPay() {
		return pay;		
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
	
	public int getCleanliness() {
		return cleanliness;
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public VampireJanitor(String name, String idNumber) {
		this.pay = "$40,000.00";
		this.name = name;
		this.title = "Vampire Janitor";
		this.idNumber = idNumber;
		this.cleanliness = 10;
		this.bloodLevel = 20;
	}
	
	public void sweep() {
		cleanliness -= 5;
	}

	public void drawBlood() {
		bloodLevel -= 1;
		
	}



}
