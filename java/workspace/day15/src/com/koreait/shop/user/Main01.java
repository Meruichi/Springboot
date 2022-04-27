package com.koreait.shop.user;

// 번거로움을 피하고자 클래스정의 전에 import구문 사용해서 명시가 가능.
import com.koreait.shop.board.Article;
public class Main01 {

	public static void main(String[] args) {

		// 패키지에 속해있는 클래스에 대한 객체 생성
		// 다른 패키지 클래스를 사용하고자 할 경우
//		// 패키지 이름을 포함한 풀네임을 사용해야 한다.
//		com.koreait.shop.board.Article.setCategory("자유게시판");
//		com.koreait.shop.board.Article article =
//				new com.koreait.shop.board.Article(1,"첫번째 글","2022-03-28");
//	
	Article.setCategory("자유게시판");
	Article article = new Article(1,"첫번째 글","2022-03-28");
	}

}
