package pack3;

public class Ex11Main {
	public static void main(String[] args) {
		// Book 객체 생성
		Ex11Book myBook = new Ex11Book("자바 클래스 활용", "박치기");

		// Student 객체 생성
		Ex11Student tom = new Ex11Student("톰", myBook);
		tom.showStudentDetail();
	}
}
