package operator;

public class Main03 {

	public static void main(String[] args) {
		int source =100;
		
		//source += 100;	// source = souce + 100; , 200
		//source -= 100;	// source = souce - 100; , 0
		//source *= 100;	// source = souce * 100; , 10000
		//source /= 100;	// source = souce / 100; , 1
		source %= 100;	// source = souce % 100; , 0
		
		System.out.println("source : " + source);

	}

}
