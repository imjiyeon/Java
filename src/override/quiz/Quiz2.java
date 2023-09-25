package override.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.taste();
		Coffee coffee2 = new Americano();
		coffee2.taste();
		Coffee coffee3 = new CafeLatte();
		coffee3.taste();
	}
}

class Coffee {
	public void taste() {
		System.out.println("커피를 마신다");
	}
}

class Americano extends Coffee {
	@Override
	public void taste() {
		System.out.println("아메리카노를 마신다");
	}
}

class CafeLatte extends Coffee {
	@Override
	public void taste() {
		System.out.println("카페라떼를 마신다");
	}
}

