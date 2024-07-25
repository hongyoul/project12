package map;

import java.util.HashMap;

//문자타입 key, 문자열타입 value를 가지는 HashMap을 생성하세요.
//다음과 같이 데이터 3개를 추가하세요.
//{'a', "사과"}, {'b', "바나나"}, {'c', "코코넛"}
//키값이 b인 요소의 값을 조회하세요
//바나나를 블루베리로 변경하세요
//사과를 삭제하세요


public class Quiz1 {

	public static void main(String[] args) {

		HashMap<Character, String> map =new HashMap<>();
		
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('C', "코코넛");

		System.out.println("hashmap: " + map);

		// key 값이 b인 요소 값 조회
		System.out.println(map.get('b'));
		
		// 데이터 수정하기
		map.replace('b', "블루베리");
		System.out.println(map);
		
		// 데이터 삭제하기
		map.remove('a');
		System.out.println(map);
	}

}
