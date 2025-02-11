package pack3;

public class Ex10Animal {
	String species;
	String name;
	Ex10Owner owner;

	public Ex10Animal(String species, String name, Ex10Owner owner) {
		this.species = species;
		this.name = name;
		this.owner = owner;
	}

	void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("종류 : " + species);
		System.out.println("주인 : " + owner.info());
	}
}
