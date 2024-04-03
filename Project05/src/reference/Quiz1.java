package reference;

//  도서관의 회원(Member)을 정의하는 클래스를 만드세요.
//  속성: 회원번호, 이름, 대여한 책1, 책2, 책3
//  책(Book)을 정의하는 클래스를 만드세요.
//  속성: 제목, 가격, 출판사, 페이지수
//
//  회원을 생성하고, 회원이 대여한 책 3권을 추가하세요.


public class Quiz1 {

	public static void main(String[] args) {
		//책 3권 생성
		Book book1 = new Book("나미야잡화점", 35000, "누리출판사", 150);
		Book book2 = new Book("아몬드", 18000, "별곰자리출판사", 210);
		Book book3 = new Book("기억전달자", 10000, "별곰자리출판사", 180);
		
		//사람 객체 생성
		Member member = new Member(1001, "둘리", book1, book2, book3);
	}
}

// 도서 클래스
class Book {
	String title; //제목
	int price; //가격
	String company; //출판사
	int page; //페이지수
	
	public Book(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

// 도서관 회원 클래스
class Member {
	int memberNo; //회원번호
	String name; //이름
	Book book1; //대여한책1
	Book book2; //대여한책2
	Book book3; //대여한책3

	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
}