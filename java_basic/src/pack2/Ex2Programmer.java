package pack2;

public class Ex2Programmer {
	// 전역변수------------------------------------------------------
	public String nickName; // 초기값이 없으면 참조형이므로 null이 됨
	private int age; // 초기값이 없으면 0 기억; => 현재 private 접근 지정자로 은닉화 된 상태
	//private int age = 0; // 위와 같은 의미
	String spec = "정보처리 자격증";

	public static String motto = "자바에 아름답게 미치자"; // 정적 필드. static 영역에 저장
	public final double WEIGHT = 66.78; //final 멤버필드는 값 수정 불가
	public static final double PI = 3.14; // 정적 필드이고 수정 불가
	// 전역변수------------------------------------------------------ class 어디서든 접근 가능

	public Ex2Programmer() { // 다른 메소드와 다르게 반환형(int, void...) 이 없다.
		// 생성자는 내용이 없는 경우에 적지 않으면 컴파일러가 내부적으로 만들어 준다.
		System.out.println("생성자 : 객체 생성시 1회만 호출 가능");
		int number = 20; // 지역변수(메소드 내에서 선언한 변수는 메소드 내에서만 유효)
		age = number + 5;
		nickName = "에러잡는 귀신";
	}

	public void displayData() {
		System.out.println("---");
		String mySpec = responseSpec(); // 메소드가 다른 메소드 호출
		System.out.println(mySpec);
		System.out.println("별명은 " + nickName + " , 나이는 " + age);
		System.out.println("---");
	}

	private String responseSpec() {
		return "내가 가진 기술은 " + spec;
	}


	// getter, setter는 은닉화? 캡슐화? => 캡슐화
	// private 멤버 외부에서 제어하기 위한 public 메소드 작성 (getter, setter)
	public int getAge() { // 메소드 이름은 약속 get멤버변수 <== getter
		return age; // age 변수 자체를 반환하는 것이 아니라 age에 기억된 정수를 반환하는 것
	}

	public void setAge(int age) { // 메소드 이름은 약속 set멤버변수 <== setter
		this.age = age;
	}

	public void setAgeEx(int age, int password) {
		if(password == 123) {
			this.age = age;
		}else {
			System.out.println("비밀번호 오류");
		}
	}
}
