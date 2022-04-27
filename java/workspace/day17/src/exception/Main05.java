package exception;

public class Main05 {

	public static void main(String[] args) {
		// 사용자의 입력값을 가정
		String src[] = {"1", "2", "3"};
		
		// src의 내용들을 숫자로 변환해서 저장할 배열
		int arr[] = new int[3];
		
		try{for(int i = 0; i < src.length; i++) {
		arr[i] = Integer.parseInt(src[i]);
		System.out.println(arr[i]);
		}}catch(NumberFormatException e){
			System.out.println("배열은 숫자로 입력해주세요");
			System.out.println(e.getMessage());}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("개수를 확인해주세요");
			System.out.println(e.getMessage());}
		catch(Exception e){
			System.out.println("알수없는 오류가 발생했습니다");
			e.getMessage();}
/*	try{}	
 * 
 */
		System.out.println("--- 프로그램 종료 ---");
		
	}

}
