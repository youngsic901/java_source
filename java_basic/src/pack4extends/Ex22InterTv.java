package pack4extends;

public class Ex22InterTv implements Ex22InterVolume, Ex22InterAdvanceVolume{
	private int vol = 0;

	@Override
	public void volResume() {
		vol = 1;
		System.out.println("라디오 소리 켜기 : " + vol);
	}

	@Override
	public void volUp(int v) {
		vol += v;
	}

	@Override
	public void volDown(int v) {
		vol -= v;
	}

	@Override
	public void volOff() {
		vol = 0;
		System.out.println("라디오 소리 끄기");
	}
}
