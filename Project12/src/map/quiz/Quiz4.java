package map.quiz;

import java.util.HashMap;
import java.util.Iterator;

public class Quiz4 {

	public static void main(String[] args) {
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
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}

//쇼핑몰 회원
class Member {
	int memberId; //회원아이디
	String memeberName; //회원이름
	
	public Member(int memberId, String memeberName) {
		super();
		this.memberId = memberId;
		this.memeberName = memeberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memeberName=" + memeberName + "]";
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
	
	// 아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {
		if(map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId+"번 회원을 삭제하였습니다");
			return true;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
		return false;
	}

	// 전체 회원을 출력하는 메소드
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
