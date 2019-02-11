package hospital;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// hashmap
		Hospital list = new Hospital(10, 10);

		// objects
		Patient patient = new Patient("Sicky", "12");
		Doctor doctor = new Doctor("Dr.Dave", "Doctor", "5");
		Surgeon surgeon = new Surgeon("SaveEm Sam", "Surgeon", "6");
		Nurse nurse = new Nurse("NancyNurse", "Nurse", "8");
		Receptionist receptionist = new Receptionist("RoryRecptionist", "Receptionist", "9");
		Janitor janitor = new Janitor("JerryJanitor", "Janitor", "3");
		VampireJanitor jVam = new VampireJanitor("Vladd", "Vampire Janitor", "1");

		// hard add to maps
		list.addPatient(patient);
		list.addEmployee(doctor);
		list.addEmployee(surgeon);
		list.addEmployee(nurse);
		list.addEmployee(receptionist);
		list.addEmployee(janitor);
		list.addEmployee(jVam);

		System.out.println("Welcome to your Administration tool for WCCI University Hospital");
		System.out.println("Press any key to continue.");
		String userInput = input.nextLine();

		// medic or admin
		System.out.println("Please select one of the following options");
		System.out.println("1. See directions");
		System.out.println("2. Continue as the Medical Director");
		System.out.println("3. Continue as the Hospital Manager");

		String userChoice = input.nextLine();
		switch (userChoice) {
		case "1":
			System.out.println("Directions will be added in future iterations");
			System.out.println("Press any key to return to the previous menu");
			break;
		
		// add remove. interact single or all patients
		case "2":
			Boolean foo = true;
			while (foo) {
				System.out.println("You have selected to work as the Medical Director");
				System.out.println("Please select one of the follwing options:");
				System.out.println("1. Admit a patient to this hospital");
				System.out.println("2. Discharge a patient from this hospital");
				System.out.println("3. Interact with a single patient");
				System.out.println("4. Interact with all patients");
				System.out.println("5. Return to previous menu");

				String userInput1 = input.nextLine();
				switch (userInput1) {
				case "1":
					System.out.println("Please enter the name of your patient you'd like to add");
					String patientName = input.nextLine();

					System.out.println("Please enter the ID Number of this patient");
					String patientIDNumber = input.nextLine();
					Patient newPatient = new Patient(patientName, patientIDNumber);
					list.addPatient(newPatient);

					System.out.println("see individual patient stats");
					System.out.println(newPatient);

					System.out.println("See your entire patient population");
					System.out.println(list.getPatientStatList());

					System.out.println("Press any key to return to the previous menu");
					String uI = input.nextLine();
					break;

				case "2":

					System.out.println(list.getPatientStatList());
					System.out.println("Please enter the Patient id number of the patient you would like to remove");

					String removePatient = input.nextLine();
					Patient rmPt = list.getPatient(removePatient);
					list.removePatient(rmPt);

					System.out.println("See your entire patient population");
					System.out.println(list.getPatientStatList());

					System.out.println("Press any key to return to the previous menu");
					String uII = input.nextLine();
					break;

				case "3":
					System.out.println(list.getPatientStatList());
					System.out.println("Please enter the ID number of the patient you would like to interact with");
					String idEntered = input.nextLine();

					Patient idPt = list.getPatient(idEntered);

					// interact with single patient
					System.out.println("What would you like to do next?");
					System.out.println("1. Treat Patient");
					System.out.println("2. Draw Blood");
					System.out.println("3. Feed Patient");
					System.out.println("4. See patient stats");
					System.out.println("5. Return to previous menu");
					String userInput2 = input.nextLine();

					switch (userInput2) {
					case "1":
						System.out.println("Would who would you like to perform this task");
						System.out.println("1. Doctor");
						System.out.println("2. Surgeon");
						String userInput4 = input.nextLine();

						switch (userInput4) {
						case "1":
							doctor.treatPatient(idPt);
							System.out.println(idPt);
							System.out.println("Press any key to return to the previous menu");
							String i = input.nextLine();
							break;
						case "2":
							surgeon.treatPatient(idPt);
							System.out.println(idPt);
							System.out.println("Press any key to return to the previous menu");
							String y = input.nextLine();
							break;
						}
					case "2":
						System.out.println("Would who would you like to perform this task");
						System.out.println("1. Doctor");
						System.out.println("2. Surgeon");
						System.out.println("3. Nurse");
						String userInput5 = input.nextLine();

						switch (userInput5) {
						case "1":
							doctor.drawBlood(idPt);
							System.out.println(idPt);
							System.out.println("Press any key to return to the previous menu");
							String k = input.nextLine();
							break;
						case "2":
							surgeon.drawBlood(idPt);
							System.out.println(idPt);
							System.out.println("Press any key to return to the previous menu");
							String rd = input.nextLine();
							break;
						case "3":
							nurse.drawBlood(idPt);
							System.out.println(idPt);
							System.out.println("Press any key to return to the previous menu");
							String lg = input.nextLine();
							break;

						}
					case "3":
						nurse.feed(idPt);
						System.out.println("The Nurse has performed this task\n");
						System.out.println(idPt);
						System.out.println("Press any key to return to the previous menu");
						String dr = input.nextLine();
						break;

					case "4":
						System.out.println(idPt);

					case "5":
						System.out.println("Press any key to return to the previous menu");
						String dy = input.nextLine();
						break;
					}
					foo = !foo;
				
				// interact with all patients
				case "4":
					System.out.println("What would you like to do?");
					System.out.println("1. Interact with all patients");
					System.out.println("2. See all patients stats");
					System.out.println("3. Return to previous menu");
					String userInput8 = input.nextLine();

					switch (userInput8) {
					case "1":
						System.out.println("What would you like to do?");
						System.out.println("1. Treat all patients");
						System.out.println("2. Draw all patient blood");
						String userInput7 = input.nextLine();

						switch (userInput7) {
						case "1":
							list.treatAllPatients();
							System.out.println(list.getPatientStatList());
							System.out.println("Press any key to return to the previous menu");
							String k = input.nextLine();
							break;

						case "2":
							list.drawAllPatientBlood();
							System.out.println(list.getPatientStatList());
							System.out.println("Press any key to return to the previous menu");
							String rd = input.nextLine();
							break;
						}

					case "2":
						System.out.println(list.getPatientStatList());
						break;
					case "3":
						System.out.println("Press any key to return to main menu.");
						break;
					}
					
				case "5" : 
	//				return;
				}
			}

		// this is the start of manager side of application
		case "3":
			Boolean doo = true;
			while (doo) {
				System.out.println("You have selected to work as the Hospital Manager");
				System.out.println("Please select one of the follwing options:");
				System.out.println("1. Direct an individual employee to complete a task");
				System.out.println("2. Return to previous menu");
				String userInput10 = input.nextLine();

				switch (userInput10) {

				// do work w/ one employee
				case "1":
					System.out.println("What type of work would you like to do");
					System.out.println("1. Sweep Floors");
					System.out.println("2. Organize Hospital");
					String userInput11 = input.nextLine();

					switch (userInput11) {

					case "1":
						System.out.println("Would who would you like to perform this task");
						System.out.println("1. Janitor");
						System.out.println("2. Vampire Janitor");
						String userInput12 = input.nextLine();
						
						switch (userInput12) {

						case "1":
							janitor.sweep(list);
							System.out.println(list.toString());

						case "2":
							System.out.println(" You have entered the lair of Vlad the Vampire Janitor");
							System.out.println("muah ha ha ha Weeeelcome my friend, what should we do?");
							System.out.println("1. Sweep the floors");
							System.out.println("2. Something much more sinister");
							System.out.println("3. Return to previous menu");
							String userInput13 = input.nextLine();

							switch (userInput13) {

							case "1":
								jVam.sweep(list);
								System.out.println(list.toString());
								break;

							case "2":
								System.out.println("1. Draw blood from all patients to make an Army of Vampires");
								System.out.println("2. Draw the blood of one patient soul to make them immortal");
								String userInput14 = input.nextLine();

								switch (userInput14) {

								case "1":
									list.drawAllPatientBlood();
									System.out.println("Hospital Closed!");
									System.exit(0);
									break;
								case "2":
									jVam.drawBlood(patient);
									System.out.println("Your Patient is now immortal!");
									break;
								}
							}
						}

					case "2":
						System.out.println("Would who would you like to perform this task");
						System.out.println("1. Nurse");
						System.out.println("2. Receptionist");
						String userInput15 = input.nextLine();

						switch (userInput15) {

						case "1":
							nurse.organize(list);
							System.out.println(list.toString());

						case "2":
							receptionist.organize(list);
							System.out.println(list.toString());

						}

					} // 241

				} // 210

			} //225
		} //44
	} //6
}//4

//				
//  System.out.println("Welcome to your Administration tool for WCCI University Hospital");
//	System.out.println("Please select one of the following options");
//	System.out.println("1. See directions");
//	System.out.println("2. Continue as the Medical Director");
//	System.out.println("3. Continue as the Hospital Manager");
//	
//	--while --
//	System.out.println("You have selected to work as the Medical Director");
//	System.out.println("Please select one of the follwing options:");
//	System.out.println("1. Admit a patient to this hospital");
//	System.out.println("2. Discharge a patient from this hospital");
//	System.out.println("3. Interact with a single patient");
//	System.out.println("4. Interact with all patients");
//	System.out.println("5. Return to previous menu");
//		//1 --while--  --if-- else-- need breaks
//		System.out.println("Please enter the name of your patient you'd like to add");
//		System.out.println("Please enter the ID Number of this patient");
//		System.out.println("See your patients current health statistics");
//		System.out.println("See your entire patient population");
//		System.out.println("Return to previous menu");
//		
//		//2
//		System.out.println("Please enter the name of your patient you would like to remove");
//		System.out.println("Please enter the ID Number of this patient");
//		System.out.println("See your patients current health statistics");
//		System.out.println("See your entire patient population");
//		System.out.println("Return to previous menu");
//		
//		//3
//		System.out.println("Please enter the name of the patient you would like to interact with");
//		//show pt stats
//		System.out.println("What would you like to do next?");
//		System.out.println("1. Treat Patient");
//			//doctor surgeon 
//			System.out.println("Would who would you like to perform this task");
//			System.out.println("1. Doctor");
//			System.out.println("2. Surgeon");
//			System.out.println("3. See patient stats");
//			System.out.println("4. Return to previous menu");
//
//				System.out.println("1. Treat all patients");
//				System.out.println("2. See all patients stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("2. Draw Blood");
//			//doctor surgeon nurse
//			System.out.println("Would who would you like to perform this task");
//			System.out.println("1. Doctor");
//			System.out.println("2. Surgeon");
//			System.out.println("3. Nurse");
//			System.out.println("4. Return to previous menu");
//
//				System.out.println("1. Draw Blood");
//				System.out.println("2. See patient stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("3. Feed Patient");
//			//nurse
//			System.out.println("The Nurse will perform this task");
//				System.out.println("1. Feed patient");
//				System.out.println("2. See patient stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("4. See patient stats");
//		System.out.println("5. Return to previous menu");
//		
//		//4
//		System.out.println("See all patient stats below");
//		//show ALL pt stats
//		System.out.println("What would you like to do next?");
//		System.out.println("1. Treat all patients");
//			//doctor surgeon 
//			System.out.println("Would who would you like to perform this task");
//			System.out.println("1. Doctor");
//			System.out.println("2. Surgeon");
//			System.out.println("3. See all patient stats");
//			System.out.println("4. Return to previous menu");
//
//				System.out.println("1. Treat all patients");
//				System.out.println("2. See all patients stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("2. Draw all patients blood");
//			//doctor surgeon nurse
//			System.out.println("Would who would you like to perform this task");
//			System.out.println("1. Doctor");
//			System.out.println("2. Surgeon");
//			System.out.println("3. Nurse");
//			System.out.println("4. Return to previous menu");
//
//				System.out.println("1. Draw Blood");
//				System.out.println("2. See all patient stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("3. Feed Patient");
//			//nurse
//			System.out.println("The Nurse will perform this task");
//				System.out.println("1. Feed patient");
//				System.out.println("2. See patient stats");
//				System.out.println("3. Return to previous menu");
//
//		System.out.println("4. See patient stats");
//		System.out.println("5. Return to previous menu");		
//		
//		//5
//		System.out.println("5. Return to previous menu");
//		
//		
//	/////////////////////////////////////////////////////////	
//		
//		
//	System.out.println("You have selected to work as the Hospital Manager");
//	System.out.println("Please select one of the follwing options:");
//	System.out.println("1. Hire an employee to join your team");
//	System.out.println("2. Fire an employee from this hospital");
//	System.out.println("3. Direct an individual employee to complete a task");
//	System.out.println("4. Return to previous menu");
//	
//	//1
//	System.out.println("Please enter the name of your employee you'd like to hire");
//	System.out.println("Please enter the ID Number of this employee");
//	System.out.println("See your current employee roster");
//	System.out.println("Return to previous menu");
//	
//	//2
//	System.out.println("Please enter the name of your employee you'd like to hire");
//	System.out.println("Please enter the ID Number of this employee");
//	System.out.println("See your current employee roster");
//	System.out.println("Return to previous menu");
//	
//	//3
//	System.out.println("What type of work would you like to do");
//	//show pt stats
//	System.out.println("What would you like to do next?");
//	System.out.println("1. Sweep Floors");
//		//doctor surgeon 
//		System.out.println("Would who would you like to perform this task");
//		System.out.println("1. Janitor");
//		System.out.println("2. Vampire Janitor");
//		System.out.println("3. See hospital stats");
//		System.out.println("4. Return to previous menu");
//			//1
//			System.out.println("1. Sweep floors");
//			System.out.println("2. See hospital stats");
//			System.out.println("3. Return to previous menu");
//			
//			//2
//			
//			System.out.println(" You have entered the lair of Vlad the Vampire Janitor");
//			//
//			System.out.println("muah ha ha ha Weeeelcome my friend, what should we do?");
//				System.out.println("1. Sweep the floors");
//				System.out.println("2. Something much more sinister");
//				System.out.println("3. Return to previous menu");
//					//2
//					System.out.println("1. Draw blood from all patients to make an Army of Vampires");
//					System.out.println("2. Draw the blood of one patient soul to make them immortal");
//						//1
//						System.out.println("Game Over -- all patients are immortal. \nThe medical staff is out of work and patients are seeking janitorial service opportunties at a hospital near you");
//						//2
//						//select patient code from above -- copy paste
//			
//			
//			
//
//	System.out.println("2. Organize your administration");
//		//receptionist nurse
//		System.out.println("Would who would you like to perform this task");
//		System.out.println("1. Nurse");
//		System.out.println("2. Receptionist");
//		System.out.println("4. Return to previous menu");
//
//			System.out.println("1. Organize all papers");
//			System.out.println("2. See hospital stats");
//			System.out.println("3. Return to previous menu");
//
//	
//	System.out.println("3. See hospital stats");
//		System.out.println("1. Return to previous menu");
//	
//	System.out.println("5. Return to previous menu");
//	
//	//4
//	System.out.println("return to previous menu");
// 
//	

//	list.addPatient(patient);
//	System.out.println(list.patientList);