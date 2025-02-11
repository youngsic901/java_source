package pack4extends;

public class Ex19AnimalMain {
	public static void main(String[] args) {
//		Ex19Animal animal = new Ex19Animal(); //추상 클래스라서 객체 생성 불가
		Ex19Cow cow = new Ex19Cow();
		System.out.println(cow.name() + " " + cow.action() + "에 " + cow.eat() + "먹음");
		cow.print(); // Animal 추상 클래스의 일반메소드 를 상속받아 호출

		System.out.println();
		Ex19Lion lion = new Ex19Lion();
		System.out.println(lion.name() + " " + lion.action() + "에 " + lion.eat() + "먹음");
		lion.print();
		lion.eatOther(); // 추상클래스에서 상속받은 메소드가 아니라 Ex19Lion클래스에서 새로 정의된 메소드

		System.out.println();
		Ex19Animal animal;
		animal = cow;
		System.out.println(animal.name() + " " + animal.action() + "에 " + animal.eat() + "먹음");
		animal = lion;
		System.out.println(animal.name() + " " + animal.action() + "에 " + animal.eat() + "먹음");
		//19줄과 21줄의 내용이 같으나 animal변수가 가리키는 객체의 주소가 달라졌으므로 출력 내용도 달라짐

		System.out.println(cow instanceof Ex19Cow); // instanceof => 객체가 특정클래스에 속하는지 확인하는 연산자
		if(cow instanceof Ex19Cow) {
			System.out.println("맞아");
		}else {
			System.out.println("아니야");
		}

		System.out.println(cow instanceof Ex19Animal); // true
		System.out.println(lion instanceof Ex19Animal); // true => 추상클래스에서 상속받은 클래스로 작성된 객체는 추상클래스에도 속하는것을 확인

		System.out.println("\n메소드 호출하며 매개변수에 주소 치환 -----");
		Ex19AnimalFind animalFind = new Ex19AnimalFind();
		animalFind.find(cow); // 주소를 치환한다는 점에서 animal = cow; 와 같은 의미

		System.out.println();
		animalFind.find(lion); // animal = lion
	}
}
