package map;

import java.util.HashMap;

//String형 키, int형 value를 가지는 HashMap 객체를 생성하세요.
//다음과 같이 데이터 3개를 추가하세요. {"국어", 80},  {"수학", 90}, {"영어", 100}
//국어를 50점, 수학을 60점, 영어를 70점으로 수정하세요.
//영어점수를 삭제하세요.
//map1의 요소를 하나씩 출력하세요.
//map1에 저장된 모든 요소를 한번에 출력하세요.
//map1의 크기를 출력하세요.


public class Quiz2 {

	public static void main(String[] args) {

		
		HashMap<String, Integer> map1 = new HashMap<>();
		
		map1.put("국어", 80);
		map1.put("수학", 90);
		map1.put("영어", 100);
		
		System.out.println("hashmap: " + map1);
		
		// 데이터 수정하기
		map1.replace("국어", 50);
		map1.replace("수학", 60);
		map1.replace("영어", 70);
		
		System.out.println("hashmap: " + map1);

		// 데이터 삭제하기
		map1.remove("영어");
		System.out.println("영어 데이터 삭제 확인: " + map1);

		// 전체 목록 출력
		System.out.println("전체 목록 출력(삭제 후): " + map1);
		
		// 크기 구하기
		int size = map1.size();
		System.out.println("map1의 크기: " + size);
		
		
	}

}
