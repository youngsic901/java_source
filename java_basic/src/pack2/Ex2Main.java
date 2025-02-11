package pack2;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2Programmer programmer1 = new Ex2Programmer();
		System.out.println("보유기술 : " + programmer1.spec);
		programmer1.displayData();

		programmer1.nickName = "웹 전문가"; // public 멤버 필드이므로 외부에서 수정 가능
		programmer1.spec = "1종 보통 운전면허";
		programmer1.displayData();

		// 캡슐화된 멤버를 해당 클래스에서 밖에서 제어하기 : getter
//		programmer1.age; // private 필드라서 접근 불가
		int mainAge = programmer1.getAge(); // public 메소드이므로 접근 가능
		System.out.println("programmer1 객체의 age : " + mainAge);

		programmer1.setAge(31); // public 메소드 setter를 이용해 private 필드에 값을 전달
		System.out.println("programmer1 객체의 age : " + programmer1.getAge());
		programmer1.displayData();
		//setter => constructor injection => 생성자 주입기

		programmer1.setAgeEx(55, 555);

		System.out.println("static, final 관련 ---");
//		System.out.println("motto: " + programmer1.motto);
		System.out.println("motto: " + Ex2Programmer.motto); // => static 멤버는 class이름으로 접근 (같은 static 공간에 저장)
//		programmer1.WEIGHT = 77.78; // 에러 : weight는 final이므로 수정 불가(참조만 가능)
		System.out.println("WEIGHT : " + programmer1.WEIGHT);
		System.out.println("PI : " + Ex2Programmer.PI);

		System.out.println("\n========================");
		Ex2Programmer programmer2 = new Ex2Programmer(); // 새로 인스턴스 생성
		programmer2.displayData();

		System.out.println("\n객체 변수가 참조하는 주소에 대하여(참고)...");
		System.out.println(programmer1 + " " + programmer2);
		//pack2.Ex2Programmer@eed1f14 pack2.Ex2Programmer@7229724f
		System.out.println(programmer1.toString() + " " + programmer2.toString());
		System.out.println(programmer1.hashCode() + " " + programmer2.hashCode());
		// 서로 타입은 같지만 서로 다른 주소를 가지고 있음

		System.out.println("----------전문가가 만든 클래스 경험----------");
		System.out.println(Integer.MAX_VALUE); // class이름으로 호출, 대문자로 작성, 이탤릭체로 작성 등으로 static final이라고 유추가 가능
	}
}