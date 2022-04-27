package override;

public class Navy extends Unit{
	public Navy(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 어뢰발사");
		System.out.println(super.getName() + " >> 지상상륙");
	}
	public void nucleus() {
		System.out.println(this.getName() + " >> 핵미사일 발사");
	}
}
