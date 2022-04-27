package string;

public class Main01 {

	public static void main(String[] args) {
		// 이메일주소에서 아이디(student) 도메인(java.com)을 구별하기
		
		// 이메일 주소 정의
		// split 사용 금지
		String email = "student@java.com";
		int email_last_pos = email.lastIndexOf("@");
		String sub_str1 = email.substring(0,email_last_pos);
		String sub_str2 = email.substring(email_last_pos+1);
		System.out.println("아이디 = " +sub_str1);
		System.out.println("도메인 = " + sub_str2);

	}

}
