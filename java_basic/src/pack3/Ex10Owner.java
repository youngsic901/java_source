package pack3;

public class Ex10Owner {
	String name;
	int age;

	public Ex10Owner( String name, int age) {
		 this.name = name;
		 this.age = age;
	}

	String info() {
		return name + "(" + age + ")";
	}
}
