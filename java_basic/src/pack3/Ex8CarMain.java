package pack3;

public class Ex8CarMain {
	public static void main(String[] args) {
		Ex8includeCar tom = new Ex8includeCar("톰");
		tom.driveTurnHandle(20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);

		tom.driveTurnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);

		Ex8includeCar oscar = new Ex8includeCar("오스카");
		oscar.driveTurnHandle(-10);
		System.out.println(oscar.ownerName + " 의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
	}
}
