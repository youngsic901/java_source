package myPack;

public class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

		System.out.println("---");
		myAnimal = myPig;
		myAnimal.animalSound();
		myAnimal = myDog;
		myAnimal.animalSound();
	}
}
