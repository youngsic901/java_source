package pack3;

public class Ex10CoinIn {
	private int coin;
	private int jandon = 0;

	public Ex10CoinIn(int coin) {
		this.coin = coin;
	}

	public int calc(int cupCount) {
		int coffeePrice = cupCount * 200;
		jandon = coin - coffeePrice;
		return jandon;
	}
}
