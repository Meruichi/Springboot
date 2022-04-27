package multiex;

public class Main01 {
	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {sum += i;}}
		System.out.println(sum);
		System.out.println("---------------------------------------");
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {sum1 += i;}}
		System.out.println(sum1);		
		System.out.println("---------------------------------------");
		// 문제3.
		/*
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		★★★★★★★★
		*/
		for(int i = 1; i <= 8; i++) {for(int j = 1; j <= 8; j++) {System.out.print("★");}
		System.out.print("\n");}
		
		System.out.println("---------------------------------------");
		// 문제4.
		/*
		★★★★★★★★
		★★★★★★★
		★★★★★★
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for(int i = 1; i <= 8; i++) {for(int j = 1; j <= 9-i; j++) {System.out.print("★");}
		System.out.print("\n");}
		System.out.println("---------------------------------------");
		
		//for(int i = 1; i <= 8; i++) {for(int j = i; j <= 8; j++) {System.out.print("★");} 선생님의답
		//System.out.print("\n");}
		//System.out.println("---------------------------------------");		
		
		//for(int i = 8; i >= 1; i--) {for(int j = 1; j <= i; j++) {System.out.print("★");}
		//System.out.print("\n");}	
		//System.out.println("---------------------------------------");
		
		
		
		// 문제5.

		/*
	 	★
		★★
		★★★
		★★★★
		★★★★★
		★★★★★★
		★★★★★★★
		★★★★★★★★
		*/
		
		for(int i = 1; i <= 8; i++) {for(int j = 1; j <= i; j++) {System.out.print("★");}
		System.out.print("\n");}	
		System.out.println("---------------------------------------");

		// 문제6. 2단~9단까지 구구단 출력  2중for문, 2중while문 두가지로
		for(int i = 2; i <= 9; i++) {System.out.print("\n"); for(int j = 1; j <= 9; j++) {int k = i * j; System.out.println(i + " * " + j + " = " + k);}}
		System.out.println("---------------------------------------");	
		int i = 2;		
		while( i <= 9 ) {int j = 1; while(j <= 9) {int k = i * j; System.out.println(i + " * " + j + " = " + k); j++; }  i++; System.out.print("\n");}
		
		// 

	}
}
