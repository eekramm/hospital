package hospital;

public class Patient {
	private int health;
	private int bloodLevel;
	private int hunger;
	private final static int HEALTH_LEVEL = 10; //default inti health level -- final sets value in stone (immutable)
	private final static int BLOOD_LEVEL = 20; //default inti blood level -- final sets value in stone (immutable)
	private final static int HUNGER = 10; //default inti hunger level -- final sets value in stone (immutable)

	
	
	public Patient(String string) {
		health = HEALTH_LEVEL;
		bloodLevel = BLOOD_LEVEL;
		hunger = HUNGER;
	}

	public int getHealth() {
		return health;
	}

	public int getBloodLevel() {
		return bloodLevel;
		
	}

	public int getHunger() {
		return hunger;
		
	}

}

//	
//	private int healthLevel;
//	private int bloodLevel;
//	private final static int BLOOD_LEVEL = 20; //default inti blood level -- final sets value in stone (immutable)
//
//	
//	public int getHealth() {
//		return health;
//	}
//	
//	public Patient(String string) {
//		health = HEALTH_LEVEL;
//		bloodLevel = BLOOD_LEVEL;
//	}
//
//	public void drawSomeBlood(int i) {
//		bloodLevel -= i;
//	}
//	
//	public void treatPatient(int i) {
//		healthLevel -= i;
//	}
//
//