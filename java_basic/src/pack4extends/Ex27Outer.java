package pack4extends;


// 내부 클래스 => 클래스의 멤버로 필드, 메소드 외에 클래스를 가질 수 있다. 이를 내부 클래스라고 한다.
// 클래스 내부에서 다른 클래스 객체를 사용해야 하는 경우가 있울 때 사용
// 참고로 한 개의 클래스는 한 개의 extends 문밖에 가질 수 없음을 주의할 것
public class Ex27Outer {
	private int kor;
	private Inner inner;

	public Ex27Outer() {
		kor = 10;
		inner = new Inner(); // 내부 클래스도 객체 생성은 포함관계처럼 해 준다.
	}

	public void aa() {
		System.out.println("외부 클래스 Outer의 aa 메소드");
		System.out.println("kor : " + kor);
		bb();
		inner.cc(); // 내부 클래스의 메소드를 호출할 때에는 내부 객체를 명시해야 한다.
		System.out.println("eng : " + inner.eng); // 내부 클래스의 필드도 내부 객체를 명시해야 한다.
	}

	private void bb() {
		System.out.println("외부 클래스 Outer의 bb 메소드 실행");
	}

	// 내부 클래스 선언
	public class Inner {
		private int eng;

		public Inner() {
			eng = 20;
		}

		public void cc() {
			System.out.println("내부 클래스 Inner의 cc 메소드 실행");
			bb(); // 외부 클래스 Outer 의  bb메소드 (해당 메소드는 그냥 부를 수 있음)
			System.out.println("내부 eng : " + eng + ", 외부 kor : " + kor); // 필드 역시 명시하지 않고 부를 수 있음
		}

		// 내부 클래스 안에 내부 클래스 선언(비권장)
		public class InnerInner {

		}
	}

	public static void main(String[] args) {
		Ex27Outer outer = new Ex27Outer();
		outer.aa();
		outer.bb();

//		Inner inner = new Inner(); // 내부 클래스는 독립적인 객체 생성이 불가능하다.(new 불가)
//		Ex27Outer.Inner inner = outer.new Inner(); // 이렇게는 가능하나 비권장
//		inner.cc();

		System.out.println();
	}

	// 내부 클래스에서는 외부 클래스의 멤버를 특별히 명시하지 않고 호출이 가능
	// 외부에서 내부 클래스의 멤버를 호출할 때에는 객체의 이름을 명시해야 함
	// 클래스가 특정한 하나의 클래스와만 관계를 맺을때 사용할 수 있다.
}
