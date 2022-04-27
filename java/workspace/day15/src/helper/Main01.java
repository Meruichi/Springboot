package helper;
//import java.util.*;
public class Main01 {

	public static void main(String[] args) {
		// 5자리의 인증번호 생성
		String authNum = "";
		for( int i = 0; i<5; i++) {
			authNum += Util.getInstance().random(0, 9);
		}
		System.out.println("인증번호 = " + authNum);
		
//		Random r1 = new Random();
//		System.out.println(r1.nextInt(89999)+10000);

	

	}

}
