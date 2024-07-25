package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz3 {

	public static void main(String[] args) {

		HashMap<String, Float> map2 = new HashMap<>();
		
		map2.put("국어", 80.0f);
		map2.put("수학", 90.0f);
		map2.put("영어", 100.0f);
		
		System.out.println("hashmap: " + map2);
		
		// 과목명만 출력
		Collection<String> key = map2.keySet();
		for (String string : key) {
			System.out.println("과목명(key)값 목록: " + string);
		}
			
		// 저장된 점수만 출력
		Collection<Float> values1 = map2.values();
		for (Float float1 : values1) {
			System.out.println("점수(values)값 목록: " + float1);
		}
		
	}

}


