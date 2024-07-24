package collection;

import java.util.ArrayList;

/*
 *  List를 사용하여 쇼핑몰 회원 관리하기
 * */
public class Ex2 {
	
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<>(); //회원 리스트 생성
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		list.add(member1);  //회원 추가
		list.add(member2);
		list.add(member3);
		list.add(member3); //같은 회원 중복 추가
		
		System.out.println(list.get(0)); //회원 꺼내기
		System.out.println(list.get(1));

		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0); //1번째 회원 삭제
		
		System.out.println("전체 회원 수: " + list.size());

		//리스트 출력하기
		System.out.println(list);
		
		//for문을 이용해서 전체 회원 정보 출력하기
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i); //리스트에서 회원을 꺼냄
			System.out.println(member.toString());	
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

