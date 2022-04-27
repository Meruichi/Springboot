package object;

class StudentUser{String name;
	public void setName(String name) {this.name = name;}
	public String getName(){return this.name;}
}
public class Main06 {

	public static void main(String[] args) {
		// StudentUser 클래스를 사용해서 객체를 생성 후 객체의 메서드만을 사용해서
		// 전역변수 name에 "자바학생"을 할당하고 출력하여라.
		StudentUser s1 = new StudentUser();
		s1.setName("자바학생");
		System.out.println(s1.getName());
	}

}
