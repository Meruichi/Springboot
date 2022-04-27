package calendar;

import java.util.Calendar;

public class Main05 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int aa = cal.get(Calendar.WEEK_OF_MONTH);
		// 이번 달은 몇주로 되어있는가?
		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		// 이번 달은 일까지 있는가?
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		// 이번 달은 무슨 요일부터 시작하는가?
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 이번 달은 몇 주인가 -> 행    일~토 요일 -> 열
		int data[][]= new int[week_count][7];
		
		// 출력할 날짜 값 -> 이 값이 1씩 증가
		int count = 1;
		
		// "주"수 만큼 반복함
		for(int i = 0; i<data.length; i++) {
			// 일~토요일 까지 반복함
			for(int j = 0; j < data[i].length; j++) {
				if( i == 0 && j<first_day - 1) {
					// i 가 0 => 첫째주, j값은 요일에대한체크 >> 이번달 첫주에서 1일이 시작되는 요일 전까지
					data[i][j] = 0;
				}
				else if ( count > day_count) {
					// 이번달의 마지막날을 초과한 경우
					data[i][j] = 0;
				}
				else {
					// 그 외의 경우에는 날짜값을 복사하고, 날짜값을 1 증가시킨다.
					data[i][j] = count++;
				}
			}
		}
		// 배열 출력을 위한 반복문
		for(int i = 0; i< data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				if(data[i][j] ==0) {System.out.print("\t");}
				else {System.out.printf("%2d\t", data[i][j]);}
	
			}
			System.out.println();
		}
		
		
		
//		for(int i = 0; i < week_count; i++)
//		{for(int j = 0 ; j < 7; j++)
//		{if( i*7+j-1 < 0 || i*7 + j - 1 > day_count){data[i][j] = 0;}
//		else { data[i][j] =  i * 7 + j - 1;}
//		}}
//		for(int i = 0; i < week_count; i++)
//		{for(int j = 0 ; j < 7; j++) { System.out.print(data[i][j] + " ");
//		}System.out.println();}
//		
//		
//		String day_name[] = {"일", "월", "화", "수", "목", "금", "토", "일"};
//		System.out.println("요일 = " + day_name[first_day]);
//		System.out.println(week_count);
//		System.out.println(day_count);
//		System.out.println(first_day);
//		System.out.println(aa);
//		
	}

}
