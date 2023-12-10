package collection;

import java.util.ArrayList;
//import collection.Member;

/*
 * ArrayList를 활용해 회원관리 프로그램 구현하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");

		// 회원 4명 추가
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();

		// 아이디로 4번째 회원 삭제
		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();
	}
}

//회원관리 클래스
class MemberArrayList {

	// 회원 목록
	ArrayList<Member> list; // 리스트 선언

	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트 생성
	}

	// 리스트에 회원을 추가하는 메소드
	public void addMember(Member member) {
		list.add(member);
	}

	// 아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			int id = member.memberId;
			if (id == memberId) {
				list.remove(i);
				System.out.println(memberId + "번 회원을 삭제하였습니다");
				return true; // 삭제에 성공했으면 true 반환
			}
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
		return false; // 삭제에 실패했으면 false 반환
	}

	// 전체 회원을 출력하는 메소드
	public void showAllMember() {
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
}