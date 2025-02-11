package pack2;

public class Ex2Student {
	private String name;
	private int grade;
	private double score;

	public Ex2Student(String name, int grade, double score){
		// this.name = "asdfas"; // 이러면 값이 고정되어 바꿀 수 없게 된다.
		// 가독성을 위해 파라미터의 이름을 멤버 필드와 맞추었다 this.를 쓰는 이유도 같은 이름끼리 맞추어서 헷갈리는 상황을 방지하기 위함이다.
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public void printStudentInfo() {
		System.out.println("이름: " + name + ", 학년: " + grade + ", 평균 점수: " + score);
	}

	public void setScore(double score) {
		this.score = score;
	}
}
