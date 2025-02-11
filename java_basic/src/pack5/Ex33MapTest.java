package pack5;

import java.util.HashMap;
import java.util.Set;

public class Ex33MapTest { // Map type의 컬렉션 : key와 value로 구성
	// key는 중복 불허, value는 중복 허용
	public static void main(String[] args) {
		HashMap<String, String> mlist = new HashMap<>();

		mlist.put("0", "하나");
		mlist.put("1", "둘");
		mlist.put("2", "셋");
		mlist.put("3", "셋");
//		mlist.put("3", "넷"); // 키값이 중복되어"넷"으로 덮어씌워짐

		System.out.println("mlist 크기 : " + mlist.size());
		System.out.println(mlist.containsKey("2"));
		System.out.println(mlist.containsValue("kbs"));

		// 출력 방법1 => map의 key부분을 set으로 변환한 뒤 iterator반복자로 내부요소 조회
		Set<String> set = mlist.keySet();
		for (String k : set) {
			System.out.println(k + " " + mlist.get(k));
		}

		System.out.println();
		// 출력 방법2 => 향상된 for문으로 내부요소 조회
		for(String k:mlist.keySet()) {
			String value = mlist.get(k);
			System.out.println(k + " " + value);
		}
	}
}