package map;

import java.util.HashMap;
import java.util.Iterator;

//HashMap 클래스를 사용하여 회원 목록 관리하기
public class Ex3 {

	public static void main(String[] args) {
		HashMap<Integer, Member> map = new HashMap<>(); //회원 map 생성
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		
		map.put(member1.memberId, member1);  //회원 추가
		map.put(member2.memberId, member2);  
		map.put(member3.memberId, member3);  
		
		System.out.println(map.get(1001)); //회원 조회
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		map.remove(1001); //1번째 회원 삭제
		
		System.out.println("전체 회원 수: " + map.size());
		
		System.out.println(map); //map 출력하기
		
		Iterator<Integer> keys = map.keySet().iterator(); //keySet에서 Iterator클래스 꺼내기
		while (keys.hasNext()) { //다음 key가 있으면
			int key = keys.next(); //key값을 가져오기
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); //값 조회
		}

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
