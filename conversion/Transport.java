package conversion;

public class Transport {

	//f
	int fee; //대중교통 객체의 요금
	int income; // 대중교통 객체의 수입.
	int passengerNum; //대중교통 객체의 탑승객 인원수
	//필드인스턴스멤버로 변수선언시 자동으로 0으로 초기화되므로 냅둠.
	String route; //대중교통 객체의 호선 혹은 버스번호.
	
	
	//c
	Transport(int fee,String route) {
		this.fee = fee;
		this.route = route;
		//대중교통 객체는 생성자를 통해 각자의 요금,승객수,노선호선 초기화함.
	}
	
	void showTransportInfo() {
		System.out.printf(" %s 의 승객은 %d명이고, 수입은 %d원 입니다.\n",this.route,this.passengerNum,this.income);
	}
	
	
	//m
	
	
	
}