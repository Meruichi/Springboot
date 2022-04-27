package pattern;

import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		// 회원가입시에 입력한 내용을 가정한 변수값들
		String name = "자바학생";
		String age = "22";
		String email = "user@java.com";
		String phone = "01012345678";

		// 한글 여부 검사
		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
		if (!isKor) {
			System.out.println("이름은 한글로 입력해주세요.");
			// 실행도중 return을 만나면 즉시 중단.
			// void형은 return 키워드만 명시한다.
			return;
		}

		boolean isNum = Pattern.matches("^[0-9]*$", age);
		if (!isNum) {
			System.out.println("나이는 숫자	로 입력해주세요.");
			return;
		}

		boolean isEmail = Pattern.matches(
				"^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$",
				email);
		if (!isEmail) {
			System.out.println("이메일 형식이 맞지 않습니다.");
			return;
		}
		boolean isPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone);
		if (!isPhone) {
			System.out.println("전화번호 형식이 맞지 않습니다.");
			return;
		}

		System.out.println("회원가입 절차를 시작합니다.");
	}

}
