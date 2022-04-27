package operator;

public class Main03 {

	public static void main(String[] args) {
		double a = 10.5d;
		float b = 20.5f;
		System.out.println(a + b); // double형이 됨
		/*
		 * 큰 범위의 변수와 작은 범위의 변수가 연산을 수행하면, 
		 * 작은 범위의 변수가 크 ㄴ범위의 데이터형으로
		 * 암묵적 변환을 수행한다.
		 * 그러므로 a+b는 double형의 변수가 되므로,
		 * float형의 값에 대입하는 것은 에러이다.
		 */
		// float f = a + b; // 오류발생
		float f = (float)a + b;
		System.out.println(f);
		double d = a + b;
		System.out.println(d);
	}

}
