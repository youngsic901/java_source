package pack;

import java.util.Scanner;

public class Test6if {

	public static void main(String[] args) {
		// 조건 판단문 if
		System.out.println("뭔가를 수행 후 if문 만나기");
		int num = 2;

		if(num >= 5) {
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}

		System.out.println("계속1");

		if(num >= 5) {
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}else {
			System.out.println("크지 않네");
		}

		System.out.println("계속2");
		int jumsu = 66;

		if(jumsu >= 70) {
			if(jumsu >= 90) {
				System.out.println("우수");
			}else {
				System.out.println("보통");
			}
		}else {
			if(jumsu >= 50) {
				System.out.println("저조");
			}else {
				System.out.println("매우 저조");
			}
		}

		System.out.println("계속3");
		int jumsu2 = 96;
		String result = "";

		if(jumsu2 >= 90) {
			result = "수";
		}else if(jumsu2 >= 80) {
			result = "우";
		}else if(jumsu2 >= 70) {
			result = "미";
		}else if(jumsu2 >= 60) {
			result = "양";
		}else { // if(jumsu2 < 50) 생략 권장
			result = "가";
		}

		System.out.println("평가 결과는 " + result);

		System.out.println("계속4");
		// 어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료.
		// 9세 이상 20세 미만인경우 3000원
		// 그 외는 5000원

		int age = 75;
		if( age <= 8 || age >= 65) {
			System.out.println("무료");
		}
		if( age >= 9 && age < 20) {
			System.out.println("3000원");
		}
		if( age >= 20 && age <65 ) {
			System.out.println("5000원");
		}

		int price = 0;
		if( age >= 9 && age < 20) {
			price = 3000;
		}else if( age > 20 && age < 65) {
			price = 5000;
		}else {
			price = 0;
		}

		System.out.println("입장료는 " + price);

		System.out.println("야구장에 입장하기 : 인증 성공");
		String id = "kbs";
		String password = "ok123";

		Scanner sca = new Scanner(System.in);
		System.out.print("id: ");
		String inputId = sca.nextLine();
		System.out.print("pwd: ");
		String inputPwd = sca.nextLine();
		sca.close();

// 		if(inputId == id && inputPwd == password) { // 기본형 비교
		if(inputId.equals(id) && inputPwd.equals(password)) { //참조형 비교
			System.out.print("로그인 성공");
		}else {
			System.out.print("로그인 실패");
		}
	}

}
