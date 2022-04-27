package pattern;


public class Main02 {

	public static void main(String[] args) {
//		RegexHelper r1 = RegexHelper.getInstance();
		String name = "자바학생";
		String age = "22";
		String email = "user@java.com";
		String phone = "01012345678";
		
		if( !RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름은 한글로 입력해주세요");
			return;
		}
		if( !RegexHelper.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 입력해주세요");
			return;
		}
		if( !RegexHelper.getInstance().isEmail(email)) {
			System.out.println("이메일 형식이 잘못된 형식입니다.");
			return;
		}
		if( !RegexHelper.getInstance().isCellPhone(phone)) {
			System.out.println("핸드폰 형식이 잘못된 형식입니다");
			return;
		}
		
//		r1.isValue("null");
//		r1.isNum("123");
//		r1.isEng("a");
//		r1.isKor("ㄱ");
//		r1.isEngNum("a1");
//		r1.isKorNum("ㄱ1");
//		r1.isEmail("a@b.com");
//		r1.isCellPhone("01012345678");
	}

}
