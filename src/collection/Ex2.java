package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

		// 회원 리스트 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member member1 = new Member(1011, "지련");
		Member member2 = new Member(1025, "지후");
		Member member3 = new Member(1021, "지구");
		
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3); //리스트의 특징: 순서o, 중복o
		
		//1번 (1,2번 동일한 코드)
		Member m = list.get(0); 
		System.out.println(m);
		
		//2번 (1,2번 동일한 코드)
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0); // 1번 회원 삭제

		System.out.println("전체 회원 수: " + list.size());
		
		// 리스트 출력하기
		System.out.println(list);
		
		// for문을 이용해서 전체 회원 정보 출력하기 (1,2번 코드를 반복문으로 다시 작성)
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i); // 리스트에서 회원을 꺼냄
			System.out.println(member.toString()); // toString() 생략가능 
		}
	}

}

// 쇼핑몰 회원
class Member {
	int memberId; // 회원아이디
	String memberName; // 회원이름

	// 생성자 추가
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
}
