package scanner;
import java.util.Scanner;

/*
 * sc.next()		: 공백 전까지 입력받음
 * sc.nextLine()	: 공백 포함 한줄전체를 입력받음
 */
public class Main02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 1 : ");
		String str1 = sc.nextLine();
		System.out.println(str1);
		System.out.println("문자열 입력 2 : ");
		String str2 = sc.next();
		System.out.println(str2);
		sc.close();
	}

}
