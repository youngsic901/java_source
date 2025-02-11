package pack4extends;

//public class Ex25Ball implements Ex24Flyer{  // 모든 메소드 오버라이딩해야 함
public class Ex25Ball extends Ex25FlyerAdapter{
	@Override
	public void fly() {
		System.out.println("야구공이 힘차게 관중석으로 날아감");
	}

	// isAnimal()은 현재 클래스에서는 필요없다고 판단해서 오버라이딩하지 않음
}
