package pack4extends;

public class Ex16Dog {
	private String name = "개";

//	public Ex16Dog() {
//
//	}

	public Ex16Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String callName() {
		return "종류 : " + name + "과";
	}

	public void print() {
		System.out.println(name + "과 동물들은 지구에 산다.");
	}
}
