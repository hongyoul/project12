package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
		
		MemberHashMap memberhashmap = new MemberHashMap();
				
		Member member1 = new Member(1001, "둘리"); 
		Member member2 = new Member(1002, "또치"); 
		Member member3 = new Member(1003, "도우너"); 
		Member member4 = new Member(1004, "고길동");
		
		memberhashmap.addMember(member1);
		memberhashmap.addMember(member2);
		memberhashmap.addMember(member3);
		memberhashmap.addMember(member4);
		
		memberhashmap.showAllMember();
		
		System.out.println("MemberHashMap에 1004번 회원이 있으면 삭제하세요!");
		
		memberhashmap.removeMember(1004);
		memberhashmap.showAllMember();
	}

}

class MemberHashMap {
	
	//클래스는 선언과 생성자를 만들어야 함 
	HashMap<Integer, Member> map;
	
	// 생성자의 목적: 인스턴스 생성 + 초기화
	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}
	
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	public void removeMember(int memberld) {
		if (map.containsKey(memberld)) {
			map.remove(memberld);
			System.out.println(memberld + "번 회원을 삭제하였습니다.");
			return;
		}
		System.out.println(memberld + "번 회원은 존재하지 않습니다.");
	}
	
	// 전체 회원을 출력하는 메소드
		public void showAllMember() {

			Collection<Member> values = map.values();

			for(Member member : values) {
				System.out.println(member);
			}
			System.out.println();
		}
	}
