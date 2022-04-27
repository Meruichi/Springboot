package collection;
import java.util.*;
public class Main03 {

	public static void main(String[] args) {
		// People class로 ArrayList생성
		List<People> plist = new ArrayList<People>();
		
		// 10명의 데이터를 임의로 추가
		plist.add(new People("첫번째손님", "01011111111"));
		plist.add(new People("두번째손님", "01022222222"));
		plist.add(new People("세번째손님", "01033333333"));
		plist.add(new People("네번째손님", "01044444444"));
		plist.add(new People("다섯번째손님", "01055555555"));
		plist.add(new People("여섯번째손님", "01066666666"));
		plist.add(new People("일곱번째손님", "01077777777"));
		plist.add(new People("여덟번째손님", "01088888888"));
		plist.add(new People("아홉번째손님", "01099999999"));
		plist.add(new People("열번째손님", "01000000000"));
	
		
		// 출력하기
		for(int i = 0; i < plist.size(); i++) {
			System.out.println(plist.get(i));		}
		
		//System.out.println(plist.toString());
	}

}
