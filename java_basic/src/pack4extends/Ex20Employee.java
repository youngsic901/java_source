package pack4extends;

abstract public class Ex20Employee {
	private String irum;
	private int nai;

	public Ex20Employee(String irum, int nai) {
		this.irum = irum;
		this.nai = nai;
	}

	abstract public double pay();
	abstract public void print(); // 추상 메소드

	public void display() {
		System.out.print("이름: " + irum + ", 나이: " + nai);
	}
}
