package collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 정수 타입의 HashSet 생성하세요
 * set에 숫자 3개를 추가하세요
 * set의 크기를 출력하세요
 * Iterator를 이용하여 set의 요소를 하나씩 출력하세요
 * */

public class Quiz5 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		
		hashSet1.add(1);
		hashSet1.add(2);
		hashSet1.add(3);
		
		System.out.println("set 숫자 3개를 추가 목록: " + hashSet1
							+ ", 크기: " + hashSet1.size());
		
		
		Iterator<Integer> it = hashSet1.iterator();
		
		
		while(it.hasNext()) { //다음 요소가 있으면
			int integer = it.next(); //다음요소를 가져옴
			System.out.print(integer + " ");
		}
		
		System.out.println();
		
		for (Integer integer : hashSet1) {
			System.out.println(integer + " ");
		}
		
	}

}
