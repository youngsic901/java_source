package pack5;

import java.util.ArrayList;
import java.util.Iterator;

//List : 이름과 같이 목록처럼 데이터를 순서에 따라 관리한다. (중복 허용)
public class Ex34ListTest {


	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("볼펜");
		list.add("연필");
		list.add("볼펜+");
		list.add("볼펜");
		list.add("마우스");
		System.out.println("list 크기: " + list.size());
		list.remove("볼펜"); // 값으로 삭제
		System.out.println("list 크기: " + list.size());
		list.remove(1); // 순서로 삭제
		System.out.println("list 크기: " + list.size());
		System.out.println("list의 0번째는 " + list.get(0));

		//for문과 향상된 for문으로 조회 가능
		for (String element : list) {
			System.out.print(element + " ");
		}

		System.out.println();
		for(String data: list) {
			System.out.print(data + " ");
		}

		//iterator 사용
		System.out.println();
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}