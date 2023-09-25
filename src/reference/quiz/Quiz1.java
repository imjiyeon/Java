package reference.quiz;

/*
 * 도서관 회원이 책 3권을 대여하는 프로그램을 구현하세요.
 * 먼저 Member와 Book 클래스를 설계하세요.
 * Member의 멤버변수: 회원번호, 이름, 대여한 책1, 책2, 책3
 * Book의 멤버변수: 제목, 가격, 출판사, 페이지수
 * 
 * Member 인스턴스를 만들고 책 3권을 추가하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		//책 3권 만들기
		Book book1 = new Book("나미야잡화점", 35000, "누리출판사", 150);
		Book book2 = new Book("아몬드", 18000, "별곰자리출판사", 210);
		Book book3 = new Book("기억전달자", 10000, "별곰자리출판사", 180);
		
		//사람 1명 만들기
		Member member = new Member(1001, "둘리", book1, book2, book3);
		
		//사람의 모든 정보 출력하기
		System.out.println(member.toString());	
	}
}

class Member {
	int memberNo;
	String name;
	Book book1;
	Book book2;
	Book book3;

	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", name=" + name + ", book1=" + book1 + ", book2=" + book2 + ", book3="
				+ book3 + "]";
	}
}

class Book {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}

}