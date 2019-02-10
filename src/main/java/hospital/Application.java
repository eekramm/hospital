package hospital;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//hashmap
		Hospital list = new Hospital(0, 0);
		
		System.out.println(BarMakerClass.barMaker(750));
		System.out.println(BarMakerClass.barMaker(1495));
	
		Patient patient = new Patient("Sicky", "12");
		Doctor doctor = new Doctor ("Dr.Dave","","5");
		Surgeon surgeon = new Surgeon ("SaveEm Sam", "" , "6"); 
		Nurse nurse = new Nurse("NancyNurse","","8");
		Receptionist receptionist = new Receptionist("RoryRecptionist","","9");
		Janitor janitor = new Janitor("JerryJanitor","","3");
		VampireJanitor jVam = new VampireJanitor("Vladd","","1");
		
		
	list.addPatient(patient);
	System.out.println(list.patientList);
	
	}

}
