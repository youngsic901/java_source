package pack;

import java.util.Scanner;

public class Test6ex {

	public static void main(String[] args) {
		// 키보드로 상품명(String sang), 수량(int su), 단가(int dan)를 받아 아래와 같이 출력
		// 상품명 마우스는 금액 : 5000원이고 세금은 500원
		// 조건 : 금액(kum)은 수량 * 단가
		// 세금(sekum)은 금액이 5만원 이상이면 금액의 10%, 3만원 이상이면 금액의 5%, 나머지는 금액의 3%

		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 : ");
		String sang = sc.nextLine(); // or sc.next();
		System.out.print("수량 : ");
		int su = sc.nextInt();
		System.out.print("단가 : ");
		int dan = sc.nextInt();
		int kum = su * dan;
		int sekum = 0;
		sc.close();

		if (kum >= 50000) {
			sekum = (int) ((double) kum / (double) 10); // or * 0.1
		} else if (kum >= 30000) {
			sekum = (int) ((double) kum / (double) 20); // or * 0.05
		} else {
			sekum = (int) ((double) kum / (double) 100 * 3); // or * 0.03
		}

		System.out.print("상품명 " + sang + "는 금액:" + kum + "원이고 세금은" + sekum + "원");
	}

}
