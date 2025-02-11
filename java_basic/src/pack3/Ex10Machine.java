package pack3;

public class Ex10Machine {
	private int cupCount;
	Ex10CoinIn coinIn;

	public Ex10Machine(int cupCount, int coin) {
		this.cupCount = cupCount;
		coinIn = new Ex10CoinIn(coin);
	}

	public void showData() {
		int jandon = coinIn.calc(cupCount);

		if(jandon >= 0) {
			System.out.println("커피 " + cupCount + "잔과 잔돈 " + jandon + "원");
		}else {
			System.out.println("요금이 부족합니다.");
		}
	}
}
