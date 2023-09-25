package inheritance.quiz;

/*
 * 베이직티비와 스마트티비 클래스를 만들고 상속관계를 구현하세요
 * 베이직티비 클래스는 전원상태, 채널, 볼륨 속성을 가지고 있다
 * 스마트티비 클래스는 전원상태, 채널, 볼륨, 아이피 속성을 가지고 있다
 * 그리고 스마트티비 클래스는 베이직티비 클래스를 상속받는다
 * 
 * 베이직티비 인스턴스를 생성하고 전원 상태는 온, 볼륨은 20, 채널은 7로 저장하세요
 * 스마트티비 인스턴스를 생성하고 전원 상태는 온, 볼륨은 30, 채널은 11, 아이피는 192.168.0.111로 저장하세요
 * 그리고 인스턴스의 정보를 출력하세요
 * */
public class Quiz2 {

	public static void main(String[] args) {
		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.volume = 10;
		tv1.channel = 5;
		tv1.displayInfo();

		System.out.println();
        
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 123;
		tv2.volume = 12;
		tv2.ip = "192.168.0.111";
		tv2.displayInfo();
	}

}

class BasicTV {
	boolean isPowerOn; //전원상태
	int channel; //채널
	int volume; //볼륨

	public void displayInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
}

class SmartTV extends BasicTV {
	String ip; //스마트티비에 필요한 속성 추가

	public void displayInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
}
