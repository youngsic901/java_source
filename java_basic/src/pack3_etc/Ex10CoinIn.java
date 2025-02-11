package pack3_etc;

public class Ex10CoinIn {
	private int coin;
	private int jandon = 0;
	private static final int COFFEE_AMOUNT = 200;

	public Ex10CoinIn(int coin) {
		this.coin = coin;
	}

	public int calc(int cupCount) {
		int coffeePrice = cupCount * COFFEE_AMOUNT;
		jandon = coin - coffeePrice;
		return jandon;
	}
}
