package object;

class Calc{
	// plus, param int x, int y, return
	int plus( int x, int y){return x + y; } 
	// minus, param int x, int y, return
	int minus( int x, int y){return x - y; } 	
	// times, param int x, int y, return
	int times( int x, int y){return x * y; } 	
	// divide, param int x, int y, return
	int divide( int x, int y){ int result = 0;
			if(y != 0) { result = x / y;} return result; } 	
	 
	
}
public class Main04 {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		// plus
		System.out.println(c1.plus(200, 100));
		// minus
		System.out.println(c1.minus(200, 100));
		// times
		System.out.println(c1.times(200, 100));
		// divide
		System.out.println(c1.divide(200, 100));
	}

}
