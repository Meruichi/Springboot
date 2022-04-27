package array;

public class Main02 {

	public static void main(String[] args) {
		// 문제 1, num 배열에 저장된 요소의 합을 구하시오
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		for(int i=0; i<num.length;i++) {sum += num[i];}
		System.out.println(sum);
		System.out.println("----------------------------");
		// 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		int[] num2 = new int[] {60, 95, 88};	
		int sum2 = 0; int avg2 = 0;
		for(int i=0; i<num2.length;i++) {sum2 += num2[i];}
		avg2 = sum2 / num2.length;
		System.out.println("합계 : " + sum2 + " 평균 : " + avg2);
		System.out.println("----------------------------");
		// 문제3, num3 배열에 저장된 요소의 최대값을 출력하시오.
		int[] num3 = new int[] {94, 85, 95, 88, 90};
		int max3 = 0;
		for(int i=0; i<num3.length; i++) {if(max3 < num3[i]){max3 = num3[i];}}
		System.out.println("최대값 : " + max3);
		//쌤답 : int max = num3[0];
		//for ( int i = 1; i < num3.length; i++){if( max < num[i] ){max =num3[i];}}
		System.out.println("----------------------------");
		// 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		int[] num4 = new int[] {22, 3, 8, 12};	
		int odd4 = 0; int even4 = 0;
		for(int i=0; i<num4.length; i++) {if(num4[i] % 2 == 1){odd4 += num4[i];}
		else{even4 += num4[i];}}
		System.out.println("홀수요소의 합 : " + odd4 + " 짝수요소의 합 : " + even4);
		System.out.println("----------------------------");
		
		
		
	}

}
