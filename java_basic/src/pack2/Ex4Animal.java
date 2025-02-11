package pack2;

// method overloading : 클래스 내에 동일 이름의 메소드를 복수로 만듦
public class Ex4Animal { // 동물이 가지는 속성과 행위를 class로 설계
	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;

	public Ex4Animal() {
		// 생성자를 작성하지 않으면 컴파일러가 내용이 없는 생성자를 자동으로 생성한다.
		System.out.println("내용이 없는 생성자");
	}

	public Ex4Animal(int leg) { // 생성자 오버로딩
		this.leg = leg;
		System.out.println("정수 1개를 받는 생성자");
	}

	public Ex4Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("2개의 매개변수가 있는 생성자");
	}

	public void display() {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}


	// 오버로딩 성립 조건
	// 매개변수의 갯수, 순서, 타입이 다르면 성립됨
	public void display(int age) { // 메소드 오버로딩
		// 지역변수 age 출력
		// this.age = age;
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}

	public void display(String name) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}

	public void display(int age, String name) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}

	public void display(String name, int age) {
		System.out.println("leg: " + leg + ", age: " + age + ", name: " + name);
	}

	// 성립 안되는 경우
//	public void display(int leg) {	} // 지역변수의 변수명이 다를 뿐 정수 하나를 받는다는 내용은 똑같으므로 오버로딩 성립이 되지 않는다.
//	public void display(String name, int leg) {	} // String 타입 하나, int 타입 하나를 받는다는 내용이 같으므로 성립되지 않는다.

//	private int display(int leg) {} // 메소드명 앞쪽은 오버로딩과는 상관 없다. int 타입 하나를 받는 내용은 위에 기입되어 있으므로 오버로딩 성립이 되지 않는다.
}
