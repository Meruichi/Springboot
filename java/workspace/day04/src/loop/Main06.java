package loop;

public class Main06 {

	public static void main(String[] args) {
		int i = 1;
		int j;
		// do {System.out.println("7 x " + i +" = " + i * 7); i++; } while ( i < 10);
		
		do {j = i * 7; System.out.println(j); i++;} while(i < 10);
		// do {System.out.println(i*7); i++;} while(i < 10);
		
	}

}
