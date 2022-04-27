package condition;

public class Main09 {

	public static void main(String[] args) {
		/*
		 * 문제1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라.
		 * */
		int money = 3000;
		if(money >= 3000) {System.out.println("Take a Taxi.");}
		else {System.out.println("Just walk.");}
		
		/*
		 * 문제2. 만약 돈이 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지않으면 걸어가라.
		 * */
		// int money = 3000;
		boolean card_owner = true;
		if(money >= 3000 || card_owner == true) {System.out.println("Take a Taxi.");}
		else {System.out.println("Just walk.");}
		
		/*
		 * 문제3. 어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		 * */
		int a = 2;
		if (a % 2 == 0) {System.out.println("짝수");}
		else {System.out.println("홀수");}
		
		/*
		 * 문제4. 특정 정수값 a2, b2, c2의 최대값을 구하여라
		 * */
		int a2 = 10;
		int b2 = 18;
		int c2 = 21;
		if (a2 >= b2 && a2 >= c2) {System.out.println(a2);}
		else if (b2 >= a2 && b2 >= c2) {System.out.println(b2);}
		else{System.out.println(c2);}
		
		/*
		 * 문제5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 장학생을 출력하여라.
		 * 문제5-2. 국어점수가 70점 이상이면 "국어 합격" 그렇지않으면 "국어 불합격"을 출력하여라.
		 * 문제 5-3. 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점"
		 * 		   60점 이상이면 "D"학점, 60점 미만이면 "F학점"을 출력하여라.
		 * */
		int korScore = 89;
		int engScore = 88;
		int mathScore = 99;
		if ( (korScore + engScore + mathScore) / 3 >= 95) {System.out.println("장학생");}
		
		if(korScore >= 70) {System.out.println("국어 합격");}
		else{System.out.println("국어 불합격");}
	
		if(mathScore >= 90) {System.out.println("A학점");}
		else if(mathScore >= 80) {System.out.println("B학점");}
		else if(mathScore >= 70) {System.out.println("C학점");}
		else if(mathScore >= 60) {System.out.println("D학점");}
		else {System.out.println("F학점");}
		
		////////////////////////// switch-case
		/*
		 * 문제1. 1은 "축구", 2는"농구", 3은 "야구", 4는 "배구" 그 외는 "배드민턴"을 출력
		 * */
		int key1 = 1;
		switch(key1) {
		case 1 : System.out.println("축구"); break;
		case 2 : System.out.println("농구"); break;
		case 3 : System.out.println("야구"); break;
		case 4 : System.out.println("배구"); break;
		default : System.out.println("배드민턴"); break;	}
		
		
		/*
		 * 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2이면 "안녕"이 두줄, 숫자가 1이면"안녕"이 한줄,
		 * 그 외는 "잘가"를 출력
		 * */
		int key2 = 4;
		switch(key2) {
		case 3 : System.out.println("안녕");
		case 2 : System.out.println("안녕");
		case 1 : System.out.println("안녕"); break;
		default : System.out.println("잘가"); break;
		
		
		}
		
		
		
		
		
	}

}
