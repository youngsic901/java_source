package pack2;

public class Ex2StudentMain {
	public static void main(String[] args) {
		// main메소드는 프로그램을 실행하기 위한 메소드. Ex2Student멤버는 아님
		Ex2Student michael = new Ex2Student("마이클", 4, 95.5);
		Ex2Student tom = new Ex2Student("톰", 2, 98.5);
		Ex2Student james = new Ex2Student("제임스", 3, 88.5);

		michael.printStudentInfo();
		tom.printStudentInfo();
		james.printStudentInfo();

//		james.setScore(99.5);
//		james.printStudentInfo();

		// micael, tom, james는 stack에 저장되면서 해당하는 객체의 주소를 가지고 있다.(참조형 변수)
		// 객체는 heap의 특정한 주소에 위치하며 참조형 변수가 그 위치를 참조한다.
	}
}