package string;

public class Main02 {

	public static void main(String[] args) {
		// 주민등록번호에서 생년월일 추출하기
		// 800501-1234567 -> 1980년 05월 01일 남자
		// 뒷자리 1, 2 : 1900년도생   3, 4 : 2000년대 생      1,3:남성    2,4:여성
		String reg = "8005011234567";
		String y2 = reg.substring(0,2);
		String mm = reg.substring(2,4);
		String dd = reg.substring(4,6);
		if((int)reg.charAt(6) == 49 || (int)reg.charAt(6) == 50) {System.out.print("19");}
		else {System.out.print("20");}
		System.out.print(y2+"년 " + mm + "월 " + dd + "일 ");
		if((int)reg.charAt(6) == 49 || (int)reg.charAt(6) == 51) {System.out.print("남자");}
		else {System.out.print("여자");}
		System.out.println();
		
//		String gender_code = reg.substring(6,7);
//		String gender = "남자";
//		if(gender_code.equals("1") || gender_code.equals("3")) {y2 = "19" + y2;}
//		else {y2 = "20" + y2;}
//		if(gender_code.equals("2") || gender_code.equals("4")) {gender = "여자";}
		// System.out.println("%s년 %s월 %s일 %s", y2,mm,dd,gender);
	}

}
