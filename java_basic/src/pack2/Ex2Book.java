package pack2;

public class Ex2Book {
	private String title;
	private String author;
	private boolean isAvailable;

	public Ex2Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public void borrow() {
		if (isAvailable) {
			System.out.println("책을 대출했습니다.");
			isAvailable = false;
		} else {
			System.out.println("다른 사람이 대출하고 있어요.");
		}
	}

	public void returnBook() {
		System.out.println("책을 반납했습니다.");
		isAvailable = true;
	}

	public void printBookInfo() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 대출 가능: " + isAvailable);
	}
}
