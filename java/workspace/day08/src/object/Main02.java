package object;

class Member{String name; int age;
	// getName(), return, 전역변수 name
	public String getName(){		return name;	}
	// setName(), param name, 전역변수 name = param name
	public void setName(String name) {		this.name = name;	}

	// getAge(), return, 전역변수 age
	public int getAge(){		return age;	}
	// setAge(), param age, 전역변수 age = param age
	public void setAge(int age) {	this.age = age;}

	// say(), getName(), getAge() 각각 출력
	public void say() {
		System.out.println( this.getName());
		System.out.println(getAge());
	}
}


public class Main02 {

	public static void main(String[] args) {
		// Member class 객체 생성
		Member m1 = new Member();
		// 메서드를 사용해서 전역변수 name, age에 임의의 데이터 할당
		m1.setName("자바학생"); 	m1.setAge(19);
		// say() 메서드 호출
		m1.say();
		
		m1.setName("DB학생"); m1.setAge(25);
		m1.say();
	}

}
