package pack4extends;

public class Ex21VolumeMain {
	public static void main(String[] args) {
//		Ex21Volume myVolume = new Ex21Volume();
		Ex21Volume myVolume;

		Ex21Radio radio = new Ex21Radio();
		Ex21Tv tv = new Ex21Tv();

		radio.volumeUp(6);
		radio.volumeDown(3);

		tv.volumeUp(7);
		tv.volumeDown(2);

		System.out.println();
		myVolume = radio;
		myVolume.volumeUp(2);
		myVolume = tv;
		myVolume.volumeUp(2);
	}
}
