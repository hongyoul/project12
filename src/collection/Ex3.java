package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리"); // 회원 추가
		hashSet.add("또치"); 
		hashSet.add("도우너"); 
		hashSet.add("도우너"); // 중복된 값은 추가 불가
		
		// 추가된 순서와 상관없이 출력됨
		System.out.println("set 목록: " + hashSet + "크기: " + hashSet.size());
		
		// 순서가 없는 set은 인덱스가 사용 불가
		hashSet.remove("도우너"); 
		System.out.println("set 목록: " + hashSet + "크기: " + hashSet.size());
		
		// Iterator 객체 생성
		Iterator<String> ir = hashSet.iterator(); //Iterator클래스 꺼내기

		// 1번 방법
		while(ir.hasNext()) { //다음 요소가 있으면
			String member = ir.next(); //다음요소를 가져옴
			System.out.print(member + " ");
		}
		
		// 2번 방법: 람다식 포(for)문
		for (String member : hashSet) {
			System.out.print(member + " ");
			
		}
		
	}

}
