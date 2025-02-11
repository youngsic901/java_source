package pack;

import java.util.Scanner;

public class Test9while {

	public static void main(String[] args) {
		// 반복문 while : while(조건){ 반복 처리 대상... }
		int w = 1;

		while(w <= 5) {
			System.out.print("w : " + w + " ");
			w++; // while문 안에는 조건이 거짓이 되는 명령문이 필요하다.
		}
		System.out.println("\n탈출 후 w : " + w);

		System.out.println();
		int count = 0;
		while(count < 10) {
			count++; // ++count, count += 1, count = count + 1 => 1을 증가시킨다는 면에서 같음
			System.out.println("count : " + count);
			if(count == 10) {
				System.out.println("count가 10이라서 반복문 종료: " + count);
			}
		}

		System.out.println("다중 while -----");
		int a = 1;
		while( a <= 3) {
			System.out.println("a : " + a);
			int b = 1;
			while(b <= 4) {
				System.out.print("b=" + b + " ");
				b++;
			}
			a++;
			System.out.println();
		}

		System.out.println("do while -----");
		int m = 10;
		do { // 최소 1회는 반드시 수행
			System.out.println("do while의 m : " + m);
			m++;
		}while(m <= 5);

		System.out.println("continue, break ----");
		int x = 0;
		while(x <= 10) {
			x = x + 1;
			if(x == 3) {
				continue;
			}
			if(x == 7) {
				break;
			}
			System.out.println("x : " + x);
		}

		System.out.println("무한 루프(looping)");
		int y = 1;
		while(true) {
			System.out.println("y : " + y);
			y++;
			if(y == 5) {
				break;
			}
		}

		System.out.println("문 : 1 ~ 10 사이의 정수중 짝수만 출력하고 그 갯수도 출력");
		int testNumber = 1;
		int testCount = 0;
		while(testNumber <= 10) {
			if(testNumber % 2 == 0) {
				System.out.println("짝수 : " + testNumber);
				testCount++;
			}
			testNumber++;
		}
		System.out.println();
		System.out.println("갯수 : " + testCount);

//		System.exit(0); // 참고 : 현재 실행중인 프로그램 무조건 종료

		System.out.println("문 : 키보드로 정수를 입력받아 1부터 그 수까지의 합을 출력");
		// 조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정
		Scanner sc = new Scanner(System.in);
		while(true) { // 무한반복 (break를 만날 때까지
			System.out.print("양의 정수를 입력 : ");
			int num = sc.nextInt();
			if(num <= 1) { // 1 이하의 값이 입력되면 작업 종료
				System.out.println("2 이상의 정수를 입력하세요");
				continue;
			}

			int n=1, total=0;
			while(n <= num) {
				total += n;
				n++;
			}
			System.out.println("합계 : " + total);

			System.out.print("계속 하려면 y를 입력하십시오.");
			String again = sc.next(); // 개행문자를 입력받지 않으려면 nextLine() 대신 next() 사용
			if(!again.equals("y")) { // ! 조건 부정
				System.out.println("\n작업 종료");
				break;
			}
		}
		sc.close(); // 참고 : 사용중인 자원 해제
	}

}
