package string;

public class Main05 {

	public static void main(String[] args) {
		// D:/photo/2022/travel/food.jpg 라는 파일이 있습니다.
		// 이 파일의 경로를 data라고 하는 객체를 생성한 뒤에, 다음의 형태로 출력하시오
		// split메서드 사용금지
		
		// 파일이름 : food
		// 확장자 : jpg
		// 폴더명 : D:/photo/2022/travel/food.jpg
		// 
		
		String data = "D:/photo/2022/travel/food.jpg";
		String name = data.substring(data.lastIndexOf("/")+1,data.lastIndexOf("."));
		String ext = data.substring(data.lastIndexOf(".")+1);
		System.out.println("파일이름 : " + name + "\n" + "확장자 : " + ext + "\n" + "폴더명 : "
		+data.substring(0, data.lastIndexOf("/")));
	}

}
