package conversion;

public class Bus extends Transport{

	Bus(int fee, String route) {
		super(fee, route);
		//super는 부모클래스의 예약어, 부모클래스 생성자 초기화를 그대로 쓴다는 개념으로
		//이를 입력함으로써 해당 클래스에는 필드를 만들어 줄 필요도, 초기화를 할 필요도 없음.
	}
	
}