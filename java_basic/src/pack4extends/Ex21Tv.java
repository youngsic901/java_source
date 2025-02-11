package pack4extends;

public class Ex21Tv implements Ex21Volume{ // 인터페이스는 implements 예약어로 상속을 정의함
	private int volLevel;

	public Ex21Tv() {
		volLevel = 0;
	}

	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Tv 볼륨 올리면 " + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Tv 볼륨 내리면 " + volLevel);
	}
}
