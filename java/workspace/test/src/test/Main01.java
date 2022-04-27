package test;

import java.util.Scanner;
public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		int m = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		int n = sc.nextInt();
		System.out.println("첫번째 정수 = " + m + "\n" + "두번쨰 정수 = " + n);
		
		
		Calc c1 = new Calc("이상훈");
		System.out.println(c1.getA());
		
		System.out.println(c1.plus(100, 50));
		System.out.println(c1.minus(100, 50));
		System.out.println(c1.multiple(100, 50));
		System.out.println(c1.division(100, 50));
		
	}
}
