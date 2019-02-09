package hospital;

public class Janitor {
	
	private String pay;
	private String name;
	private String title;
	private String idNumber;
	private int cleanliness;

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
	
	public Janitor(String name, String idNumber) {
		this.pay = "$40,000.00";
		this.name = name;
		this.title = "Janitor";
		this.idNumber = idNumber;
		this.cleanliness = 10;
	}

	public void sweep() {
		cleanliness -= 5;
	}



}
