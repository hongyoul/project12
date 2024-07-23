package generic;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 숫자를 저장하는 리스트 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		Integer integer1 = list.get(0);
		System.out.println(integer1);
		
		
		// 문자열을 사용하는 리스트 생성
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("aaa");
		String string = list2.get(0);
		System.out.println(string);
	}

}
