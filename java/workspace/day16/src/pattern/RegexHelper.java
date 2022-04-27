package pattern;

import java.util.regex.Pattern;

public class RegexHelper {
	/* 1. 싱글톤
	 * 2. boolean isValue(String str), str : 검사할 문자열, 공백, null체크(공백이나 null있으면 false)
	 * 3. boolean isNum(String str), str : 검사할 문자열, 숫자형식 검증체크
	 * 4. boolean isEng(String str), str : 검사할 문자열, 영문인지 체크
	 * 5. boolean isKor(String str), str : 검사할 문자열, 한글인지 체크
	 * 6. boolean isEngNum(String str), str : 검사할 문자열, 영문,숫자인지 체크
	 * 7. boolean isKorNum(String str), str : 검사할 문자열, 한글,숫자인지 체크 
	 * 8. boolean isEmail(String str), str : 검사할 문자열, 이메일인지 체크
	 * 9. boolean isCellPhone(String str), str : 검사할 문자열, 휴대전화번호인지 체크
	 * --------------------------------------------------------------------- 
	 * main() class에서 해당 메서드 사용
	 */
	private static RegexHelper current;

	public static RegexHelper getInstance() {
		if (current == null) {
			current = new RegexHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private RegexHelper() {
		super();
	}
	// 싱글톤 객체 생성을 위한 준비 끝

	// 이 클래스가 구현해야 하는 기능
//	public void isValue(String str) {
//		//
//		if (str.contains(" ") || str == "" || str == null) {
//			System.out.println("공백이 있거나 입력되지 않았습니다.");
//			return;
//		}
//	}
	public boolean isValue(String str) {boolean result = false;
	if( str != null) { result = !str.trim().equals("");}
	return result;}
	
	
//	public void isNum(String str) {
//		if (!Pattern.matches("^[0-9]*$", str)) {
//			System.out.println("숫자형식이 아닙니다.");
//			return;
//		}
//	}
	public boolean isNum(String str) {boolean result = false;
		if( isValue(str) ){
			result = Pattern.matches("^[0-9]*$", str);}
		return result;
	}
	public void isEng(String str) {
		if (!Pattern.matches("^[a-zA-Z]*$", str)) {
			System.out.println("영문형식이 아닙니다.");
			return;
		}
	}

	public boolean isKor(String str) 	{boolean result = false;
	if( isValue(str) ){
		result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);}
	return result;
}


	public void isEngNum(String str) {
		if (!Pattern.matches("^[a-zA-Z0-9]*$", str)) {
			System.out.println("영문과 숫자형식이 아닙니다.");
			return;
		}
	}

	public void isKorNum(String str) {
		if (!Pattern.matches("^[ㄱ-ㅎ가-힣0-9]*$", str)) {
			System.out.println("한글과 숫자형식이 아닙니다.");
			return;
		}
	}

	public boolean isEmail(String str)	{boolean result = false;
	if( isValue(str) ){
		result = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", 
				str);}
	return result;
		}

	public boolean isCellPhone(String str)	 {boolean result = false;
	if( isValue(str) ){
		result = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", str);}
	return result;
}
	

	
}
