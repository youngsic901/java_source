package pack4extends;

public class Ex18HandPhone extends Ex18Jepum{
	@Override
	public void volumeControl() {
		System.out.println("핸드폰의 볼륨 변경");
	}

	@Override
	public void volumeShow() {
		System.out.println("소리 크기 : " + volume);
	}
}
