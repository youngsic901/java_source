package pack5;

import java.util.HashSet;

// collection : 객체를 담을 수 있는 기억장소
// 많은 수의 데이터를 그 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체
// 자바에서는 이러한 컬렉션을 위한 인터페이스와 클래스들이 있다.
// 컬렉션의 종류는 ArrayList, LinkedList, Vector, Stack, HashSet, TreeSet, HashMap, TreeMap등이 있고 다음과 같이 분류된다.
// List : 이름과 같이 목록처럼 데이터를 순서에 따라 관리한다. (중복 허용)
// Set : 중복이 허용되지 않는 데이터를 관리한다.
// Map : 데이터를 key와 Value로 짝을 이루어 관리하며, Key 값은 중복을 허용하지 않는다.
// Queue : 데이터순서를 FIFO 방식으로 관리
// Stack : 데이터순서를 LIFO 방식으로 관리
public class Ex32SetTest { // 중복 불허, 순서가 없음

	public static void main(String[] args) {
		// 컬렉션타입 클래스<제네릭> : 컬렉션에 저장할 객체의 타입을 제한하는 역할
		HashSet<String> hlist = new HashSet<>();
//		hlist.add(1); // 기본형인 int 타입이지만 컬렉션에 넣으면 자동으로 Integer 클래스로 변환되어 저장됨 => wrapper 클래스
//		hlist.add(1.5); // double => Double 클래스로 변환
		hlist.add("첫번째");
		hlist.add("세번째");
		hlist.add("두번째");
		hlist.add("첫번째");
		hlist.add("두번째");
		System.out.println("hlist 크기 : " + hlist.size());
//		hlist.remove("두번째");
//		System.out.println("hlist 크기 : " + hlist.size());

		for (String str : hlist) {
			System.out.println(str);
		}

		// 출력방법2 => 컬렉션을 배열로 변환하여 내부조회
		System.out.println();
		Object obj[] = hlist.toArray(); // 컬렉션을 배열로 변환
		for (Object element : obj) {
			System.out.println(element);
		}

		// 출력방법3 => 향상된 for문으로 내부조회
		System.out.println();
		for(String aa: hlist) {
			System.out.println(aa);
		}

		System.out.println();
		for(Object bb: obj) {
			System.out.println(bb);
		}
	}
}
