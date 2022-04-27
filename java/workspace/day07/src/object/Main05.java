package object;

class User{public void setName(String name) {System.out.println(name);}}
class User1{String subject; int age; String hobby;
public void setName2(String name, String hobby) {System.out.println(name);
this.subject = "국비지원"; this.age = 25; this.hobby = hobby;
System.out.println("과목 : " + this.subject + ", 나이 : " + this.age + ", 취미 : " + this.hobby);}
}
public class Main05 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("자바학생");
		User1 u2 = new User1();
		u2.setName2("자바학생","독서");
	}

}
