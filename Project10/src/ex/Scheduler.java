package ex;

/*
 * 스케줄러 인터페이스 만들기
 * */
public interface Scheduler {

	public void getNextCall(); // 다음 전화를 가져오는 메소드

	public void sendCallToAgent(); // 상담원에게 전화를 배분하는 메소드

}
