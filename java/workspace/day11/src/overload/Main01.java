package overload;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character();
		System.out.println(c.toString());
		
		c.setProperty(19);
		System.out.println(c.toString());
		
		c.setProperty("회사원");
		System.out.println(c.toString());
		
		c.setProperty("자영업", 20);
		System.out.println(c.toString());
		
		c.setProperty("교수", 35);
		System.out.println(c.toString());
		
	}

}
