package exam3;

public class Exam03 {

	public static void main(String[] args) {
		// 1번
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum=" + sum);
		
		// 2번
		int total = 0;
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		for(int i = 0; i < arr2.length; i++) {for(int j = 0; j < arr2[i].length; j++) {
			total += arr2[i][j];
		}}
		System.out.println("total="+total);
		int l = 0;
		for(int i = 0; i < arr2.length; i++) {
			l += arr2[i].length;
		}
		int average = total / l;
		System.out.println("average="+average);
	
		// 3번
		
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			if(money / coinUnit[i] >= 1){
				System.out.println(coinUnit[i] +"원 : " + (money / coinUnit[i]));
				money -= ((money / coinUnit[i]) * coinUnit[i]);
			}
		}	

		// 4번
		int[] num = {94, 85, 95, 88, 90};
		int max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] >= max) {max = num[i];}
		}
		System.out.println("최대값 : " + max);
		
		// 5번
		int[] num2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int even = 0, odd = 0;
		for(int i = 0; i < num2.length; i++) {if(num2[i] % 2 == 0) {
			even += num2[i];	}
		else{odd += num2[i];}}	
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
		
	
	
	}

}
