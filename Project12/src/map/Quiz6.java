package map;

import java.util.HashMap;
import java.util.Iterator;

/*
 * Map를 활용해 회원관리 프로그램 구현하기
 * */
public class Quiz6 {

	public static void main(String[] args) {
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
		MemberHashMap memberHashMap = new MemberHashMap();
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		memberHashMap.showAllMember();
		
		System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}

//회원관리 클래스
class MemberHashMap {
	
	//회원목록을 저장할 map
	HashMap<Integer, Member> map; // map 선언

	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}
	
	// 맵에 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	// Q.아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {
		if(map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId+"번 회원을 삭제하였습니다");
			return true;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
		return false;
	}

	// Q.전체 회원을 출력하는 메소드
	public void showAllMember() {
		Iterator<Integer> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			Member member = map.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
