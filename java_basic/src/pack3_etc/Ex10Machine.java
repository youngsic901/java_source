package pack3_etc;

import java.util.Scanner;

public class Ex10Machine {
	private int cupCount;
	private Ex10CoinIn coinIn;

	public Ex10Machine() {

	}

	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("동전을 입력하세요 : ");
		coinIn = new Ex10CoinIn(scanner.nextInt());

		System.out.print("몇 잔을 원하세요 : ");
		cupCount = scanner.nextInt();

		scanner.close();
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
