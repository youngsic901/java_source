package pack4extends;

public class Ex17PolyMain {
	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();
		Ex17PolyTaxi taxi1 = new Ex17PolyTaxi();

		System.out.println();
		car1.dispData();
		System.out.println(car1.getSpeed());

		System.out.println("\n버스에 대해 ...");
		bus1.dispData();
		System.out.println(bus1.getSpeed());
		bus1.show();

		System.out.println("\n택시에 대해 ...");
		taxi1.dispData();
		System.out.println(taxi1.getSpeed());

		System.out.println("\n===========주소 치환============");
		Ex17PolyCar car2 = new Ex17PolyBus(); // Ex17PolyCar타입의 car2변수에 Ex17PolyBus타입 객체가 promotion 으로 저장됨
		car2.dispData();
//		car2.show();

		System.out.println();
		Ex17PolyCar car3 = taxi1; //Ex17PolyCar타입의 car3변수에 taxi1변수에 담겨있던 Ex17PolyTaxi객체의 주소가 저장됨
		car3.dispData();

		System.out.println("---------다형성---------------");
//		Ex17PolyBus bus2 = new Ex17PolyCar(); // Ex17PolyBus 타입의 변수에 Ex17PolyCar타입의 변수의 주소를 삽입하려해서 err메세지 출력(Type mismatch)
		Ex17PolyBus bus2 = (Ex17PolyBus)car2; // 부모타입이지만 자식의 주소를 가지므로 캐스팅 가능
		bus2.dispData();
		bus2.show();

		System.out.println();
//		Ex17PolyTaxi taxi2 = new Ex17PolyCar();
		Ex17PolyTaxi taxi2 = (Ex17PolyTaxi)car3;
		taxi2.dispData();

//		Ex17PolyTaxi taxi3 = (Ex17PolyTaxi)car1; // car1변수는 Ex17PolyCar타입 객체의 주소를 담고 있으므로 Ex17PolyTaxi타입으로 casting 되지 않는다.
		// ClassCastException

		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		Ex17PolyCar p[] = new Ex17PolyCar[3]; // Ex17PolyCar타입의 배열에 Ex17PolyBus타입, Ex17PolyTaxi타입 변수의 주소가 promotion되어 배열에 저장됨
		p[0] = car1;
		p[1] = car2;
		p[2] = car3;
		p[0].dispData();
		p[1].dispData();
		p[2].dispData();

		System.out.println();
		for (Ex17PolyCar element : p) { // for문으로 배열에 저장된 객체의 dispData 메소드를 실행함
			element.dispData();
		}
		System.out.println();
		for(Ex17PolyCar car:p) {
			car.dispData();
		}

	}
}
