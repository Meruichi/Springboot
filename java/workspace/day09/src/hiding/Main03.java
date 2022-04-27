package hiding;

public class Main03 {

	public static void main(String[] args) {
		Article a1 = new Article(11,"ジレンマ","君の“好き”の後遺症","DECO*27",1684020,"2022-03-10");
		System.out.println("글 번호 : " + a1.getSeq());
		System.out.println("글 제목 : " + a1.getSubject());
		System.out.println("글 내용 : " + a1.getContent());
		System.out.println("작성자 : " + a1.getWriter());
		System.out.println("조회수 : " + a1.getHit());
		System.out.println("작성일자 : " + a1.getRegDate());

	}

}
