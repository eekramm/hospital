package hospital;

public class Receptionist {

	private String pay;
	private String name;
	private String title;
	private String idNumber;
	private int organizationStatus;
	
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
	
	public int getOrganizationStatus() {
		return organizationStatus;
	}
	
	public Receptionist(String name, String idNumber) {
		this.pay = "$45,000.00";
		this.name = name;
		this.title = "Receptionist";
		this.idNumber = idNumber;
		this.organizationStatus = 10;
	}

	public void organize() {
		organizationStatus += 5;
		
	}






}
