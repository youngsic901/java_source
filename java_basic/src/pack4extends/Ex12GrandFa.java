package pack4extends;

public class Ex12GrandFa {
	private int age = 70;
	public String gabo = "상감청자";
	protected String gahun = "차카게 살자";

	public Ex12GrandFa() {
		System.out.println("할아버지 생성자");
	}

	public Ex12GrandFa(int age) {
		this();
		this.age = age;
	}

	public void say() {
		System.out.println("할아버지 말씀 : 자바에 집중해라");
	}

	public void eat() {
		System.out.println("밥은 맛있게...");
	}

	public int getAge() {
		return age;
	}


}
