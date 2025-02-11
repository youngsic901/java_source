package pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex36DtoTest2 {
	ArrayList<Ex36StudDto> list = new ArrayList<>();

	public void insertData() {
		Scanner sc = new Scanner(System.in);
		Ex36StudDto student = null;

		while(true) {
			student = new Ex36StudDto();
			System.out.print("이름입력 : ");
			student.setName(sc.next());

			System.out.print("국어 점수 : ");
			student.setKorean(sc.nextInt());

			System.out.print("영어 점수 : ");
			student.setEnglish(sc.nextInt());

			list.add(student);

			System.out.println();
			System.out.print("계속할까요?(y/n)");
			String stopFlag = sc.next();
			if( stopFlag.equals("n")) {
				sc.close();
				break;
			}
		}
	}

	public void showData() {
		System.out.println();
		System.out.println("이름\t국어\t영어\t총점");
		for (Ex36StudDto element : list) {
			System.out.println(element.getName() + "\t" +
					element.getKorean() + "\t" +
					element.getEnglish() + "\t" +
					(element.getKorean() + element.getEnglish())
			);
		}
		System.out.println("응시인원 " + list.size() + "명");
	}

	public static void main(String[] args) {
		Ex36DtoTest2 test2 = new Ex36DtoTest2();
		test2.insertData();
		test2.showData();
	}
}
