package pack4extends;

public class Ex16DogMain {
	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());

		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("집 개");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();

		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.show();

		System.out.println("------");
		Ex16WolfDog bushDog = wolfDog; // 주소를 치환 ( 타입이 같은 경우 치환 성공 )
		wolfDog.print();
		bushDog.print();

		Ex16Dog dog2 = wolfDog; // 주소를 치환 ( 타입이 다른데도 불구하고 치환 성공 - 자식의 주소를 부모 객체변수에 주는 경우 )
		// Promotion => 자식의 주소값을 부모타입의 변수에 삽입 가능
		// Ex16Dog 타입에 Ex16WolfDog 타입 참조 변수 저장
		dog2.print(); // 오버라이딩된 메소드만 부모 객체변수명으로 호출 가능
//		dog2.show(); // 자식이 가진 고유 메소드는 부모 객체변수명으로 호출할 수 없다.
		Ex16WolfDog hidog = (Ex16WolfDog)dog2; // casting
		hidog.print(); // 일반형 변수만이아니라 참조형 변수도 promotion과 casting 이 일어남

		System.out.println("----------");
		Ex16Dog coyote = new Ex16Dog("코요테");
		coyote.print();
		System.out.println(coyote.callName());

		Ex16WolfDog wolfDog2 = new Ex16WolfDog("늑대2");
		wolfDog2.print();
		wolfDog2.show();

		coyote = wolfDog2; // promotion : 자식 객체 주소를 부모 객체변수에 치환
		coyote.print(); // 오버라이딩된 메소드는 허용
//		coyote.show(); // 자식 고유 메소드는 호출 불가
		coyote.getName();

		Ex16WolfDog wolfDog3 = null;
//		wolfDog3.show();
		wolfDog3 = wolfDog2; // 타입이 같으므로 성공
//		wolfDog3 = houseDog; // 타입이 다르므로 실패

//		wolfDog3 = coyote; // 타입이 다르므로 실패. 하지만 부모타입인 coyote 변수는 자식의 주소를 기억중
		wolfDog3 = (Ex16WolfDog)coyote; // 그러므로 casting을 통해 지환 가능
		wolfDog3.print();
	}
}
