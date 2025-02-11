package pack5;

public class Ex48Bank {
	private int money = 10000;	// 스레드가 공유할 자원
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	// public void saveMoney(int mon) {	// 입금
	synchronized void saveMoney(int mon) {	// synchronized가 적용된 메소드 내의 멤버 필드는 스레드에서 공유가 가능
		// 어떤 스레드가 멤버 필드 money를 사용하는 동안 Lock이 걸림
		// saveMoney 메소드 수행이 끝나면 자동으로 Lock이 풀림
		
		int m = this.getMoney();
		try {
			Thread.sleep(2000);	// 입금 지연시간 2초
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setMoney(m + mon);
	}
	
	public synchronized void minusMoney(int mon) {	// 출금
		int m = this.getMoney();
		try {
			Thread.sleep(3000);	// 출금 지연시간 3초
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setMoney(m - mon);
	}
}
