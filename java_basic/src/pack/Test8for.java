package pack;

public class Test8for {

	public static void main(String[] args) {
		System.out.println("뭔가를 하다가 ... 반복문 만나기");
		// 반복문 for
		int a;
		int hap = 0; // 누적 변수명
		for (a = 1; a <= 5; a++) {
			System.out.print(a + "\t");
//			a = 7; // 반복문 내에서 for문에 사용중인 변수는 갱신 비권장 => 반복 횟수가 내가 의도한대로 안 나올 수 있음
			hap = hap + a;
		}

		System.out.println("\nfor 탈출1 : " + a);
		System.out.println("합은 " + hap);

		System.out.println();

		for (int i = 65; i <= 90; i++) { // 변수는 되도록 지역적으로 선언할 것 => 변수명 중복이 될 수 있음
			System.out.print((char) i + " ");
		}
		System.out.println("\nfor 탈출2");

		System.out.println();
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nfor 탈출3");

		System.out.println();
		for(int i = 10; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("\nfor 탈출4");

		System.out.println();
		for(int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) {
			System.out.print(ytn + "," + tvn + " ");
		}

		System.out.println("\nfor 탈출5");
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++ ) {
			System.out.print(aa + " ");
		}
		System.out.println("\nfor 탈출6");
		System.out.println();
		for(int sbs = 1; sbs <= 10; sbs++) {
			if( sbs % 2 == 0) {
				System.out.print(sbs + " ");
			}

			if(sbs == 6)
			 {
				break; // 반복문 무조건 탈출
			}
		}
		System.out.println("\nfor 탈출7");
		System.out.println();
		// 다중 for -----------
		for(int m=1; m <= 3; m++) {
			System.out.println("m:" + m);
			for(int n=1; n <= 4; n++) {
				System.out.print("n=" + n + " ");
			}
			System.out.println();
		}
		System.out.println("\nfor 탈출8");
		System.out.println();

		for(char i = 65; i <=90; i++) {
			System.out.print(i + " : ");
			for(char j=i;j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("문제");
		// 문1) 구구단 3단 출력
		for(int dan=1; dan < 10; dan++) {
			System.out.println("3 * " + dan + " = " + (3 * dan));
		}
		System.out.println();

		// 문2) 2 ~ 9 단까지 출력
		for(int dan=2; dan <=9; dan++) {
			for(int su=1; su <=9;su++) {
				System.out.print(dan + "*" + su + "=" + (dan * su) + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 문3) 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수를 출력하고, 건수와 그들의 총 합을 출력
		int count = 0;
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0 ) {
				System.out.println(i);
				count++;
				total += i;
			}
		}
		System.out.println();
		System.out.println("건수 : " + count);
		System.out.println("총합 : " + total);

		System.out.println("continue, break -----");
		for(int i = 1; i <= 10; i++) {
//			if(i == 3) continue; // 자기와 대응되는 for문으로 무조건 이동(해당 루프 즉시 탈출)
//			if(i == 5) continue;
//			if(i == 3 && i == 5) continue; // 변수는 1:1 대응이므로 해당 조건은 불가능
			if(i == 3 || i == 5) {
				continue;
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}

		// 무한 반복문 => 비권장하지만 있을 수 있음
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("kk");
			if(kk == 5)
			 {
				break; // break문으로 강제로 종료할 수 있음
			}
		}
	}

}