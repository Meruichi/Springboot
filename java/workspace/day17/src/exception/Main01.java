package exception;

public class Main01 {

	public static void main(String[] args) {
		// 문자열의 숫자 변환에 아무런 문제가 없다.
		String year1 = "1980";
		int age1 = 2022 - Integer.parseInt(year1)+1;
		System.out.println(age1);

		// 에러발생
		String year2 = "뭘까";
		int age2 = 2022 - Integer.parseInt(year2);
		System.out.println(age2);
		System.out.println("--------프로그램 종료-----------");
	
	}

}
