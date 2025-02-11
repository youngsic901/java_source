package pack4extends;

public class Ex20EmployeeMain {
	public static void main(String[] args) {
		Ex20Temporary tem = new Ex20Temporary("홍길동", 23, 20, 150000);
		tem.print();

		Ex20Regular reg = new Ex20Regular("신기해", 25, 2345000);
		reg.print();

		Ex20Salseman sal = new Ex20Salseman("손오공", 27, 2890000, 30000, 0.25);
		sal.print();

		Ex20Manager man = new Ex20Manager("사오정", 33, 4578000);
		man.print();
	}
}