package pack4extends;

public class Ex20Regular extends Ex20Employee{
	private double salary;

	public Ex20Regular(String irum, int nai, double salary) {
		super(irum, nai);
		this.salary = salary;
	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println(", 급여: " + salary);
	}
}
