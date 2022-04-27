package overload;



public class Main03 {
	// 생성자가 여러가지 형태로 Overload 되어 있기 때문에
	// 객체를 생성하는 방법이 다양해졌다.
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member(19);
		Member m3 = new Member("학생");
		Member m4 = new Member(25,"의사");
		Member m5 = new Member("검사",39);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());
	}

}
