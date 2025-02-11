package pack4extends;

public class Ex20Manager extends Ex20Regular{
	private double incentive;

	public Ex20Manager(String irum, int nai, int salary) {
		//생성자에는 수식을 넣지 말것
		super(irum, nai, salary);
	}

	@Override
	public double pay() {
		if(super.pay() >= 2500000) {
			incentive = super.pay() * 0.6;
		}else if( super.pay() >= 2000000) {
			incentive = super.pay() * 0.5;
		}else {
			incentive = super.pay() * 0.4;
		}

		return super.pay() + incentive;
	}

	@Override
	public void print() {
		display();
		System.out.println(", 수령액: " + pay());
	}
}
