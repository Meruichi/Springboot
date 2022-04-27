package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character c1 = new Character("주인공");
		Monster m1 = new Monster("몬스터");
		
		c1.walk();
		c1.run();
		c1.jump();
		c1.attack();
		c1.shield();
		c1.pickup();
		
		m1.walk();
		m1.run();
		m1.jump();
		m1.attack();
		m1.shield();
	}

}
