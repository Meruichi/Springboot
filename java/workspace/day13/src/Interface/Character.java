package Interface;

public class Character implements Action, Fight, Move{
	String name;
	public Character(String name) {super(); this.name = name;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void walk() {
		System.out.println(">> 걷기");
	}

	@Override
	public void run() {
		System.out.println(">> 달리기");
	}

	@Override
	public void jump() {
		System.out.println(">> 점프");
	}

	@Override
	public void attack() {
		System.out.println(">> 공격");
	}

	@Override
	public void shield() {
		System.out.println(">> 방어");
	}

	@Override
	public void pickup() {
		System.out.println(">> 아이템 줍기");
	}

}
