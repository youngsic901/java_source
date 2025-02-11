package pack2;

// 싱글톤(singleton) 패턴 gof의 디자인 패턴 중 하나로 객체의 인스턴스가 1개만 생성되게 하는 패턴
// 메모리 절약, 데이터 공유가 편리
// 유연성이 떨어짐, 테스트가 어려움
public class Ex6Singleton {
	int kor = 100;
	String name = "tom";

	public Ex6Singleton() {
		System.out.println("Ex6Singleton 생성자");
	}

	public void kbs() {
		System.out.println("kbs");
	}

	// 싱글톤 디자인 패턴
//	private Ex6Singleton singleton = new Ex6Singleton();
	private static Ex6Singleton singleton = new Ex6Singleton();

	public static Ex6Singleton getInstance() {
		return singleton;
	}
	// 다른 클래스에서 참조하지 못하게 private 생성자 사용, 자기 스스로객체를 생성해 초기화
	// Ex6Singleton 클래스, abc() 메소드 전부 static 영역에 저장됨 singleton 변수는 stack영역에 있으므로 에러 발생 => static 삽입
	// 위에서 작성한 필드를 갖다 쓸 수 있음
}
