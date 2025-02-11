package pack4extends;

public class Ex12MyFamily {
	public static void main(String[] args) {
		Ex12GrandFa grandFa = new Ex12GrandFa();
		System.out.println("가보 : " + grandFa.gabo);
		System.out.println("가훈 : " + grandFa.gahun);
		grandFa.say();
		System.out.println("할아버지 나이 : " + grandFa.getAge());

		System.out.println("-----");
		Ex12Father father = new Ex12Father();
		System.out.println("가보 : " + father.gabo);
		System.out.println("가훈 : " + father.gahun);
		father.say();
		System.out.println("아버지 나이 : " + father.getAge());
		father.eat();
		father.showData();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Ex12Me me = new Ex12Me();
		System.out.println("가보 : " + me.gabo);
		System.out.println("가훈 : " + me.gahun);
		me.say();
		System.out.println("내 나이 : " + me.getAge());
		me.eat();
		System.out.println("집 : " + me.getHouse());
		me.Biking();
	}
}
