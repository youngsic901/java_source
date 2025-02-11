package pack2;

public class Ex2BookMain {
	public static void main(String[] args) {
		Ex2Book book1 = new Ex2Book("어린왕자", "생텍쥐베리", false);
		Ex2Book book2 = new Ex2Book("ㅁ;ㅣㄴ아", "ㄻㅎㄴㅇ", true);
		Ex2Book book3 = new Ex2Book("asdff", "asdaga", false);

		book1.borrow();
		book2.returnBook();
		book3.printBookInfo();
	}
}
