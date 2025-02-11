package pack;

public class Test2 {
	public static void main(String[] args) {
		// 주석 : 실행과 무관, 설명시에 사용
		String irum = "신기해";  //문자열을 변수에 기억
		System.out.print(irum); // 계속 이어서 출력
		System.out.println(irum); // 라인 스킵 후 출력
		System.out.println(irum);

		// 변수 : 값(데이터)을 저장할 수 있는 메모리 공간(새로운 값을 입력하면 덮어쓰기됨)
		// 변수명 : 변수에 대한 임의의 이름 형식 : 타입 변수명 = 리터럴(문자, 숫자 ...)
		// 상수 : 처음에 입력한 값이 계속 유지되는 메모리 공간

		// 변수 기본형 타입 : bcbsilfd => boolean character byte short int long float double
		// 기본형 처럼 사용하는 참조형 타입 : String!!!!

		// byte type
		byte var1; // 1바이트(-128 ~ 127 정수 기억장소)
		var1 = 10;
		var1 = 5;
		System.out.println("var1 : " + var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		//(byte) = (int) => promotion
		byte var2 = 123; //대입(치환)
		System.out.println("var2 : " + var2);

		//(short) = (int) => promotion
		short var3 = 10;

		//(short) = (int) => promotion 불가능
//		var3 = 32768;
		System.out.println("var3 : " + var3);

		int var4 = 10;

		//(int) = (long) => promotion 불가능
//		var4 = 2147483649;
		System.out.println("var4 : " + var4);

		System.out.println("형변환에 대해...");

		byte aa = 10; //  자동 형변환함(promotion) (int 타입의 10을 byte로 자동 형변환 후 기억)
		aa = (byte)10;// 강제 형변환 (cast 연산자를 이용해  casting함)

		//(byte)타입 변수에 long타입 정수를 casting => 10
		aa = (byte)10L; // byte타입 변수에 long타입 정수 => err
		System.out.println("aa : " + aa);

		//(byte) = int로 강제 형변환 => 예측하지 못한 값 (logic err)
		aa = (byte)200;
		System.out.println("aa : " + aa);
		aa = 5;
		int imsi = 7;
		byte bb = 7;
//		byte cc = imsi; //변수는 값이 변할 수 있으므로 에러
		byte cc = (byte)imsi; // casting으로 byte타입을 쓴다고 명시
		System.out.println("aa : " + aa);
		System.out.println("bb : " + bb);
		System.out.println("cc : " + cc);

		//long
		long var5; //8바이트 정수
		var5 = 10;
//		var5 = 2147483648; //4바이트(int)로 취급되어 에러
		var5 = 2147483648L; //long type의 데이터
		var5 = 123L;
		System.out.println("var5 : " + var5);

		System.out.println("실수에 대해 ...");
		float f1 = 3; // 실수형 기억장소(4byte) : 소수점 이하 7자리 보장
		// 정수는 실수로 자동형변환(promotion)됨
//		f1 = 123.12; // 기본적으로  double형이라 에러
		f1 = 123.12f; // or 123.12F => float type데이터
		f1 = (float)123.12; // float로 강제 형변환
		System.out.println("f1 : " + f1);

		double d1 = 123;
		d1 = 123.12;
		System.out.println("d1 : " + d1);

		System.out.println();

//		int aa1 = 3.5;
		int aa1 = (int)3.5; // 소수이하 버리고 정수만 기억 반올림 X!
		//(int) = (byte)로 casting된 정수를 int형으로 promotion
		aa1 = (byte)3;
		System.out.println("aa1 : " + aa1);

//		int aa2 = 12 + 10.5; // int형 변수에 double형인 계산결과 => err
		int aa2 = 12 + (int)10.5;
		aa2 = (int)(12 + 10.5);// 소괄호의 의미가 다름에 주의

		int aa4 = (int)12.6 + (int)10.5;
		System.out.println("aa4 : " + aa4);
		aa4 = (int)(12.6 + 10.5);
		System.out.println("aa4 : " + aa4);

		System.out.println("aa2 : " + aa2);

		double aa3 = 12 + 10.5; // 정수는 실수로 형변환 후 연산
		System.out.println("aa3 : " + aa3);

		//작은 타입이 큰 타입으로 형변환(casting, promotion)변수타입과 데이터는 별개, 기본적인 형태는 int, double
		//short var = 10; => promotion
		//byte var = (byte)10; casting
		//long var = 123L; => long타입 변수

		System.out.println("논리형(boolean, 참 또는 거짓 결과의 자료형)에 대해 ...");
		boolean bu1 = true;
		bu1 = false;
		System.out.println("bu1 : " + bu1);

		System.out.println("문자형(char, 한 개의 문자 기억)에 대해 ...");
		char c1 = 'A';
//		c1 = 'bc'; //Invalid character constant => 문자형태의 리터럴에 문자열을 삽입해서 에러
//		c1 = "b"; //Type mismatch => String 형태의 리터럴을 char 형태의 변수에 삽입해서 에러


		System.out.println("c1 : " + c1);
		System.out.println("c1 : " + c1 + " " + (int)c1 + " " + (char)65);
		//Ascii 코드에서 'A'는 십진수 65, 'a' :97, '0': 48.......

		System.out.println("안녕" + (char)13 + "반가워");

		int abc = 0x0f; // 16진수(0x리터럴)를 10진수int 형으로 저장
		System.out.println("abc : " + abc + " " + Integer.toHexString(15));
		System.out.println("abc : " + abc + " " + Integer.toBinaryString(15));

		int abc2 = 007;// 8진수(0리터럴)를 10진수int 형으로 저장
		System.out.println("abc2 : " + abc2);

		final double PI = 3.14; // 상수
//		PI = 5.6; // 상수는 변경될 수 없음 err
		System.out.println("PI : " + PI); // 상수는 변수와 구분하기 위해 대문자로만 작성한다.
	}
}
