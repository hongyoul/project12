package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		//문자를 저장하는 리스트 생성
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A'); //리스트 추가
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0)); //리스트 요소 하나씩 출력
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);	//리스트 요소 삭제
		
		System.out.println("2번째 요소 삭제: " + list); //리스트 전체 출력
		System.out.println("리스트 크기: " + list.size()); //리스트 크기
	}
}
