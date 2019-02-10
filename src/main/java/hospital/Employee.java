package hospital;

public abstract class Employee {
	private String name;
	private String title;
	private String idNumber;
	private String pay;


	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public String getIdNumber() {
		return idNumber;
	}
	
	public String getPay() {
		return pay;
	}

	public Employee(String name, String title, String idNumber) {
		this.name = name;
		this.title = title;
		this.idNumber = idNumber;
	}
}
