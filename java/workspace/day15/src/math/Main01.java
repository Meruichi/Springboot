package math;

public class Main01 {

	public static void main(String[] args) {
		
		/* java.lang.Math 클래스
		 * 수학과 관련된 메서드들을 갖고 있는 클래스
		 */
		// 주어진 두 수에 대한 최대값 구하기
		
		int max = Math.max(100,9999);
		System.out.println("최대값 = " + max);
		
		// 최소값
		int min = Math.min(100, 9999);
		System.out.println("최소값 = " + min);
		
		// 절대값
		int abs = Math.abs(-123);
		System.out.println("절대값 = " + abs);
		
		// 소수점 반올림
		long num = Math.round(3.12345);
		System.out.println("소수점 반올림 = " + num);
		
		// 원주율
		System.out.println("원주율 = " + Math.PI);
		
		// 지수,로그,제곱근
		System.out.println("log(5) = " + Math.log(5));
		System.out.println("log(5)의 반올림 = " + Math.round(Math.log(5)));
		System.out.println("루트5 = " + Math.sqrt(5));
		System.out.println("2의 5승 = " + Math.pow(2, 5));
	}

}
