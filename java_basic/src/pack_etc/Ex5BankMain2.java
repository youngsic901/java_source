package pack_etc;

import java.math.BigDecimal;

import pack2.Ex5Bank;

public class Ex5BankMain2 {
	public static void main(String[] args) {
		// Ex5Bank와 다른 패키지에서 Ex5Bank 클래스를 참조함
		Ex5Bank bank1 = new Ex5Bank();
//		System.out.println(bank1.money);
//		System.out.println(bank1.imsi); // package가 달라졌으므로 default 접근지정자 접근 불가
		System.out.println(bank1.imsi2);

		System.out.println(BigDecimal.ONE); // 전문가가 만든 클래스 참조시 import 필요
	}
}