package conversion;


public class CoffeeAndTransport {

	public static void main(String[] args) {
		Commuter james = new Commuter("James", 7000);
		Commuter thomas = new Commuter("Thomas", 10000);
		Commuter kim = new Commuter("kim", 8000);
		Commuter lee = new Commuter("lee", 12000);
		
		Transport bus = new Bus(1000, "버스 100번");
		Transport metro = new Metro(1500, "지하철 2호선");		
		
		CafeMenu star = new CafeStarCoffee("아메리카노", 4000);
		CafeMenu bean = new CafeBeanCoffee("라떼", 4500);
		
		james.commute(bus,star);
		System.out.println("---------------------------");
		thomas.commute(metro, bean);
		System.out.println("---------------------------");
		lee.commute(metro, star);
		System.out.println("---------------------------");
		kim.commute(bus, bean);
		System.out.println("===========================");
		star.showIncome();
		bean.showIncome();
		System.out.println("===========================");
		bus.showTransportInfo();
		metro.showTransportInfo();
	}

}