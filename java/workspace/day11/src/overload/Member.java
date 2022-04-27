package overload;

public class Member {
	private String job;
	private int age;
	private int age2;
	private int age3;
	private int age4;
	private int age5;
	// 기본 생성자
	Member(){}
	// age를 param값으로받는 생성자
	Member(int age){this.age = age;}
	// job을 param값으로받는 생성자
	Member(String job){this.job = job;}
	// job, age를 param값으로 받는 생성자
	Member(String job, int age){this.job = job; this.age = age;}
	Member(int age, String job){this.age = age; this.job = job;}
	// 클래스명, job, age를 출력해주는 toString()
	
	@Override
	public String toString(){
		return "Member [job = " + job + ", age = " + age +
				", age2 = " + age2 +", age3 = " + age3 +", age4 = " + age4 +
				", age5 = " + age5 + "]";}
	
//public String toString(){
	//	return "클래스명 : Member, job = " + job + ", age = " + age;}
	
	
	//main() 클래스 생성, 객체생성을 생성자 타입별로 생성후 toString으로 출력
}
