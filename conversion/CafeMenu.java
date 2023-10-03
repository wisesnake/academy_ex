package conversion;

public class CafeMenu {
	//f
	String brand;
	String coffee;
	int fee;
	int income;
	
	//c
	CafeMenu(String brand, String coffee, int fee){
		this.brand = brand;
		this.coffee = coffee;
		this.fee = fee;
	}
	
	
	
	//m
	void showIncome() {
		System.out.printf("금일의 %s 의 매출은 %d원 입니다. \n",this.brand,this.income);
	}
	
}