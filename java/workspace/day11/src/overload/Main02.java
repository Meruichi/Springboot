package overload;

class Hello{
	Hello(){System.out.println("Hello");}
	Hello(String msg) {System.out.println(msg);}
}
public class Main02 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello("hi");
		h1.toString();
		h2.toString();
		
	}

}
