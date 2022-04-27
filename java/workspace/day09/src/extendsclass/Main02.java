package extendsclass;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle a1 = new QNAArticle();
		a1.setNum(1); a1.setTitle("첫번째 질문"); a1.setAnswer("첫번째 답변");
//		System.out.println(a1.getNum());
//		System.out.println(a1.getTitle());
//	    System.out.println(a1.getAnswer());
		System.out.println(a1.toString());
		
		FileArticle f1 = new FileArticle();
		f1.setNum(10); f1.setTitle("10번째 자료 입니다."); f1.setFileName("day10.ppt");
		System.out.println(f1.toString());
	
	}

}
