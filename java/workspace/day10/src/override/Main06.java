package override;

public class Main06 {

	public static void main(String[] args) {
		Army army1 = new Army("육군");
		army1.attack();
		army1.tank();
	
		Navy navy1 = new Navy("해군");
		navy1.attack();
		navy1.nucleus();
		AirForce airforce1 = new AirForce("공군");
		airforce1.attack();
		airforce1.bombing();
	}

}
