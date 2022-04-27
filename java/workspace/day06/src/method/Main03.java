package method;

public class Main03 {

	public static void main(String[] args) {
		System.out.println(f1(5));
		boolean result = f2(10);
		System.out.println(result);
		System.out.println(f2(10));
	}

	public static int f1( int x ) {int y = x + 1; return y;}
	
	public static boolean f2( int x ) {
		if(x>5) {return true;}	else{return false;} }
	
	
}
		
		
	