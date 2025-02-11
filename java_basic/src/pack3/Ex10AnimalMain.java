package pack3;

public class Ex10AnimalMain {

	public static void main(String[] args) {
		Ex10Owner owner = new Ex10Owner("홍길동", 33);
		Ex10Animal animal = new Ex10Animal("말티즈", "뽀삐", owner);

		animal.introduce();
	}

}
