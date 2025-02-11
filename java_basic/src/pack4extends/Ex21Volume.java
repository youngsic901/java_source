package pack4extends;

//abstract public class Ex21Volume {
//	abstract public void volumeUp(int level);
//	abstract public void volumeDown(int level);
//}

public interface Ex21Volume { // 인터페이스 : 추상 클래스의 다른 형태(super 클래스를 여러번 상속 받을 수 있음)
	void volumeUp(int level);
	void volumeDown(int level);

//	public void print() { // 일반 메소드 사용 불가
//		System.out.println();
//	}
}
