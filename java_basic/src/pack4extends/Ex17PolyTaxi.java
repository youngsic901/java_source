package pack4extends;

public class Ex17PolyTaxi extends Ex17PolyCar{
	private int passenger = 2;

	public Ex17PolyTaxi() {
		 System.out.println("Taxi 생성자 시작");
	}

	@Override
	public void dispData() {
		String msg = "택시 안에 몇 명이 타고 있니? " + passenger;
		System.out.println(msg);
	}

}
