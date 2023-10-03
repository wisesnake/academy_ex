package conversion;

public class Commuter {

	//f
	String name; 
	int money; 
	
	
	
	
	//c
	Commuter(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	
	//m
	void ride(Transport transport) {
		++transport.passengerNum;
		//ride 메소드를 실행했으니 대중교통 객체의 승객1명이 증가했다.
		this.money -= transport.fee;
		//탑승한 사람의 소지금에서 대중교통 객체의 요금만큼 차감.
		transport.income += transport.fee;
		//해당 대중교통 객체의 수입금을 요금만큼 증가시킴.
	}
	
	void buy(CafeMenu menu) {
//		System.out.printf("%s 님은 %d 원을 내고 %s 에서 %s 를 마셨습니다. \n",this.name,menu.fee,menu.brand, menu.coffee);
		this.money -= menu.fee;
		menu.income += menu.fee;
	}
	
	void commute(Transport transport, CafeMenu menu) {
		this.buy(menu);
		this.ride(transport);
		System.out.printf("%s 님은 %s 를 사고 %s 를 타고 출근했습니다.\n",this.name, menu.coffee, transport.route);
		System.out.printf("구매내역 : %s, %d | %s, %s, %d | 총사용액 : %d \n",transport.route,transport.fee,menu.brand,menu.coffee,menu.fee,transport.fee + menu.fee);
		moneyLeft();
	}
	
	void moneyLeft() {
		System.out.printf("%s 님의 남은 금액 : %d\n",this.name, this.money);
	}
	
	
}