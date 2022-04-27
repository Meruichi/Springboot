package collection;
import java.util.HashMap;
import java.util.Map;
public class Main01 {

	public static void main(String[] args) {
		// 데이터를 저장할 배열 생성
		// 제너릭 -> < 값의이름, 값의종류>
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		// 데이터 추가는 put 메서드를 사용
		hm.put("국어", 95);
		hm.put("수학", 90);
		hm.put("영어", 85);
		hm.put("수학", 100); // 중복허용안됨 << 수학점수가 90점에서 100점으로 수정됨
		hm.put("영어", null); // 객체를 넣는것이므로 null 사용가능
		
		// 저장된 갯수 얻기
		System.out.println("HashMap size : " + hm.size());
		
		// 데이터 꺼내기
		System.out.println(hm.get("국어"));
		System.out.println(hm.get("영어"));
		System.out.println(hm.get("수학"));
		
		
		
	}

}
