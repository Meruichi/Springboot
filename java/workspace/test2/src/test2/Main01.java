package test2;

public class Main01 {

	public static void main(String[] args) {
		Student s1 = new Student("JAVA", 60, 70 , 80 ,90 ,100);
		System.out.println(s1.total());
		System.out.println(s1.average());
		System.out.println(s1.toString());
	}

}
