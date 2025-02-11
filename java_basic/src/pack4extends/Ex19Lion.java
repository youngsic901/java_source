package pack4extends;

public class Ex19Lion extends Ex19Animal{
	@Override
	public String name() {
		return "사자";
	}

	@Override
	public String eat() {
		return "고기";
	}

	@Override
	public String action() {
		return "밤";
	}

	public void eatOther() {
		System.out.println("가끔 소세지도 먹음");
	}
}
