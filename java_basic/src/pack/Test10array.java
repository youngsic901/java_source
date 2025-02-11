package pack;

public class Test10array {

	public static void main(String[] args) {
		// 배열 : 타입(성격과 크기)이 일치하는 여러 개의 기억장소(변수)를 대표명 하나만 주고 첨자(색인)로, 각 기억장소를 구분. 반복처리에 효과적임

		int kor, eng, mat;
		kor = 90;
		eng = 80;
		mat = 100;
		int tot = kor + eng + mat;

		System.out.println("세 과목 점수의 합은 " + tot);

		// 배열을 사용해 3과목 점수의 합 구하기
		int jumsu[] = new int[3];
		jumsu[0] = 90; jumsu[1] = 80; jumsu[2] = 100;
		int tot2 = 0;
		for(int i = 0; i < 3; i++) {
			tot2 = tot2 + jumsu[i];
		}
		System.out.println("세 과목 점수의 합은 " + tot2);

		System.out.println();
//		int ar[]; // 배열로 선언(아직 기억장소를 확보하지 못함), int[] ar;
//		ar = new int[5]; // 5개의 기억장소가 확보됨
//		위 2줄을 한줄로 선언
		int ar[] = new int[5]; // 대표명 ar인 int type의 변수 5개를 선언
		System.out.println("배열의 크기 : " + ar.length);
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = ar[0] + ar[1];
		System.out.println("ar[2] : " + ar[2]);
		System.out.println(ar[3]); // 기본값은 0을 기억
		//배열의 인덱스는 0부터 출발, 양의 정수만 가능

		int kbs = 2;
		System.out.println("ar[2] : " + ar[2] + " " + ar[kbs] + " " + ar[kbs + 1 - 1]);
		// ar[kbs] <== kbs를 첨자변수 또는 색인변수, index variable이라고 부른다.

		// 배열 선언 후 초기값 저장
		int[] ar2 = {1,2,3,4,5}; // 내부적으로 new를 함
		System.out.println(ar2[2] + " " + ar2[4]);

		for (int element : ar2) { // 배열 요소값 반복문으로 출력
			System.out.print(element + " ");
		}

		System.out.println();
		for(int k=0; k < ar2.length; k++) { // 반복문으로 배열 요소에 값 저장
			ar2[k] = k + 10;
		}

		for (int element : ar2) {
			System.out.print(element + " ");
		}

		System.out.println();
		// 배열을 이용한 반복처리시 향상된 for를 사용 가능
		for(int no:ar2) { // ar2 배열요소가 차례대로 no에 치환되면서 반복처리
			System.out.print(no + " ");
		}

		System.out.println();
		double silsu[] = {3.5,2.1,6.8};
		for (double element : silsu) {
			System.out.print(element + " ");
		}

		System.out.println();
		String[] city = {"서울", "제주", "원주"};
		for (String element : city) {
			System.out.print(element + " ");
		}

		System.out.println();
		for(String abc:city) {
			System.out.print(abc + " ");
		}

		System.out.println("5명의 사람 키(정수)를 배열에 저장하고 평균 키 출력");
		int[] heights = {178, 166, 177, 175, 180, 160, 155, 199};

		int hap = 0;
		for(int a:heights) {
			hap += a;
		}

		System.out.println(heights.length + "명의 키 평균은 " + (double)hap / heights.length);

		// heights 기억장소는 1차원 배열 : 한 행에 요소(열)로만 구성된 배열

		System.out.println("2차원(다차원) 배열 --------");
//		 int su; // 한개의 독립 변수
//		 int su[]; // 열로만 구성된 집합 변수 : 1차원배열
//		 int su[][]; // 행과 열로 구성된 집합 변수 : 2차원배열

//		 su = new int[3][4];
		 int su[][] = new int[3][4];
		 System.out.println("행의 갯수 : " + su.length);
		 System.out.println("열의 갯수 : " + su[0].length);
		 su[0][0] = 7;
		 System.out.println("su[0][0] : " + su[0][0]);

		 // 2차원 배열 su에 값 저장
		 int num = 10;
		 for(int i = 0; i < su.length; i++) {
			 for(int j=0; j< su[i].length; j++) {
				 su[i][j] = num++;
			 }
		 }
//		 System.out.println("su[0][0]: " + su[0][0]);
		 // 2차원 배열 su에 값 출력
		 for (int[] element : su) {
			 for(int j=0; j< element.length; j++) {
				 System.out.print(element[j] + " ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println("문1 : 1차원 배열 요소에서 홀수와 짝수의 합 각각 출력");
		 int arr[] = {1 ,2, 3, 4 ,5 ,6};

		 int hap1 = 0;
		 int hap2 = 0;
		 for (int element : arr) {
			 if(element % 2 == 0) {
				 hap2 += element;
			 }else {
				 hap1 += element;
			 }
		 }

		 System.out.println("홀수의 합 : " + hap1);
		 System.out.println("짝수의 합 : " + hap2);

		 System.out.println();
		 System.out.println("문2 : 2차원 배열 전체 요소의 합을 출력");
		 int arr2[][] = {{1, 2}, {3, 4}};

		 int hap2d = 0;
		 for (int[] element : arr2) {
			 for(int b = 0; b < element.length; b++) {
				 hap2d += element[b];
			 }
		 }
		 System.out.println("2차원 배열의 합 : " + hap2d);
	}

}
