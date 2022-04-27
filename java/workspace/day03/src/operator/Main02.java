package operator;

public class Main02 {

	public static void main(String[] args) {
		long l = 100L;
		int i = (int)l;
		short s = (short)i;
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		
		double pi1 = 3.14D;
		
		// 큰 범위의 변수를 작은 범위의 변수에 대입하는 것은 에러
		// int pi2 = pi1;
		
		// 명시적 형변환이 필요하다
		int pi2 = (int)pi1;
		
		System.out.println(pi1);
		System.out.println(pi2);
	}

}
