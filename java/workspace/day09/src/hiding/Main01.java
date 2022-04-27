package hiding;

public class Main01 {

	public static void main(String[] args) {
		// 객체 생성
		StudentJava2 s1 = new StudentJava2();
		// setter 임의의 데이터 세팅, name, age 모두
		s1.setName("자바학생"); s1.setAge(19);
		// getter 출력, name, age 모두
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}
