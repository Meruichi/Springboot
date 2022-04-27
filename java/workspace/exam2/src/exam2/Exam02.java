package exam2;

public class Exam02 {

	public static void main(String[] args) {
		// 1번
		int i = 0;
		while(i <= 10) {int j = 0;
			while(j <= i) {
				System.out.print("*"); j++;
			}System.out.println(""); i++;
		}
		
		// 2번
		int ar[] = {1, 2, 3, 4, 5, 6};
		int ar2[] ={1, 2, 3, 4, 5, 6};
		for(int a = 0; a < 6; a++){
			for(int b = 0; b < 6; b++) {
				if(ar[a] + ar2[b] == 6) {
					System.out.println(ar[a] + "+" + ar2[b] +"=" + (ar[a] + ar2[b]));
				}
			}
			
		}

		// 3번
		for(int x = 0; x >= 0 && x <= 10; x++ ) {
			for(int y = 0; y >= 0 && y <= 10; y++){
				if(2*x + 4*y == 10){System.out.println("x=" + x + ", y=" + y);}
			}}
		

		
		
	}

}
