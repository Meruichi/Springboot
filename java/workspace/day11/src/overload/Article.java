package overload;

public class Article {
	private int seq; // 글 번호
	private String subject; // 글 제목
	private String writer; // 글 작성자

	// 파라미터가 있는 생성자
	// Alt + Shift + s >> Generate Constructer using fields
	Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}

	Article(int seq, String writer) {
		this(seq, "제목없음", writer);
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = writer;
	}
	Article(int seq) {
		this(seq, "제목없음", "익명");
//		this.seq = seq;
//		this.subject = "제목없음";
//		this.writer = "익명";
	}
	// toString()
	// Alt + Shift + s >> Generate toString()...
	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}

}
