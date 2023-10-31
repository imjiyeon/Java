package arraylist;

import java.util.ArrayList; //ArrayList 클래스 import

/*
 * 리스트에 도서정보 저장하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>(); //리스트 생성
		
		list.add(new Book("태백산맥", "조정래")); //add메소드로 리스트에 요소 추가
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		
		System.out.println("=== 일반 for문 사용 ===");
		for(int i=0; i<list.size(); i++){
			Book book = list.get(i);
			book.showBookInfo();
		}

		System.out.println("=== 람다식 for문 사용 ===");
		for(Book book : list){
			book.showBookInfo();
		}

	}
}

class Book {
	String bookName; //제목
	String author; //저자

	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo(){
		System.out.println(bookName + "," + author);
	}
}