package collection.quiz;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(1004);
		memberArrayList.showAllMember();
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
class MemberArrayList {
	ArrayList<Member> list;

	public MemberArrayList() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i);
			int id = member.memberId;
			if(id == memberId) {
				list.remove(i);
				System.out.println(memberId+"번 회원을 삭제하였습니다");
				return true;
			}	
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for(int i=0;i<list.size();i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
		System.out.println();
	}
}