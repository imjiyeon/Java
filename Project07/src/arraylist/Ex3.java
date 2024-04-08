package arraylist;

import java.util.ArrayList; //ArrayList 클래스 import

/*
 * 리스트에 도서정보 저장하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		// 리스트 생성
		ArrayList<Book> list = new ArrayList<Book>(); 

		// 리스트에 도서정보를 추가
		Book book1 = new Book("태백산맥", "조정래");
		list.add(book1); // 객체를 미리 만들고 추가
		list.add(new Book("데미안", "헤르만 헤세")); // 객체를 생성하면서 추가해도됨
		list.add(new Book("어떻게 살 것인가", "유시민"));

		// 리스트에 저장되어있는 도서 정보 꺼내기
		// 일반 for문 사용
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showBookInfo();
		}

		// 람다식 for문 사용
		for (Book book : list) {
			book.showBookInfo();
		}

	}
}

// 도서 클래스
class Book {
	String bookName; // 제목
	String author; // 저자

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}