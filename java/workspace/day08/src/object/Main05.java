package object;

class Article{int seq; String subject; String writer; //글번호, 글제목, 작성자
	// 파라미터가 존재하는 생성자
	// 모든 전역변수를 초기화
	 public Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	 }


	// 메서드, 전역변수 각각을 출력하는 메서드 작성
	  void read() {
		  System.out.println(this.seq);
		  System.out.println(this.subject);
		  System.out.println(this.writer);
	  }
	 
}

public class Main05 {

	public static void main(String[] args) {
		// Article 객체 1번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article a1 = new Article(1,"メデ","月詠み");
		a1.read();
		// Article 객체 2번 생성
		// 객체.메서드(); (출력 메서드 호출)
		Article a2 = new Article(2,"ジレンマ","DECO*27");
		a2.read();
	}

}
