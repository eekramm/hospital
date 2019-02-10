package hospital;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;

public class HospitalTest {

	Hospital testHosptial;

//	@Before
//	public void setup() {
//		testHospital = new Hospital();
	

	@Test
	public void shouldAddPetToShelter() {
		Hospital testHospital = new Hospital(new HashMap<>()); //creates new shelter to pass through test
		Employee petToAdd = new Employee("","",0);//creates new pet to pass through test
		int initialPets = ((Hospital) underTest).getEmployeesLength();//gets the amount of pets before adding
		underTest.addEmployee(employeeToAdd);//adds a pet to the list
		int petsAfterAddition = ((Hospital) underTest).getEmployeesLength(); //gets the amount of pets after adding 
		assertEquals(initialPets + 1, petsAfterAddition); 
		
	}
}
