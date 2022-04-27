package loop;

public class Main10 {

	public static void main(String[] args) {
		// for문 문제
		// 문제1. 1~50까지 숫자의 합
		int num = 0;
		for(int i = 1; i <= 50; i++) {num += i;}
		System.out.println(num);
		
		// 문제2. 구구단 8단
		// 2 * 1 = 2 이런식
		for(int j = 1; j < 10; j++) {int k = j * 8; System.out.println("8 * " + j + " = " + k);}
		
		// while문 문제
		// 문제1. 10번찍어 안 넘어 가는 나무 없다.
		// 나무를 1번 찍었습니다.  나무를 2번 찍었습니다. 등등  나무를 10번 찍었습니다.  나무 넘어갑니다.
		/* int l = 0;
		while( true ) {l++; System.out.println("나무를 " + l +"번 찍었습니다.");
		if( l >= 10) {System.out.println("나무 넘어갑니다.");break;}} */
		int treeHit = 0;
		while(treeHit < 10) {treeHit++; System.out.println("나무를 " + treeHit + "번 찍었습니다.");}
		if(treeHit == 0 ) {System.out.println("나무가 넘어갑니다.");}
		

	}

}
