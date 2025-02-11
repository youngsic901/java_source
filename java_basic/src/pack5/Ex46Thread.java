package pack5;

/* 
 * 하나의 프로그램은 하나의 Process에 해당한다. process를 실제로 실행하기 위한 실행 단위를 Thread라고 한다. Thread 하나는 한 개의 실행을 담당하므로 결국, 여러 개의
 * Thread를 이용하면 여러 개의 작업(task)을 할 수 있게 된다.
 * single thread는 single tasking, multi thread는 multi tasking을 하게 된다.
 * 여러 개의 응용 프로그램을 실행하고 싶을 때 또는 네트워크 작업을 효율적으로 운영하려면 스레드 처리는 필수적이다!!!!!
 */
public class Ex46Thread implements Runnable{
	
	public Ex46Thread() {
		
	}
	
	public Ex46Thread(String name) {
		Thread tt = new Thread(this, name);
		tt.start();
	}
	
	@Override
	public void run() {
		// start() 에 의해 호출되며 run 처리가 끝나면 스레드 작업이 종료된다.
		for(int i = 0; i <= 50; i++) {
			System.out.println(i + Thread.currentThread().getName());
			try {
				Thread.sleep(500); // 1000ms => 1초
			} catch(Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) { // 기본적으로 모든 프로그램은 main스레드가 자동 실행한다.
		// 사용자 정의 스레드를 사용하지 않은 경우
		/*
		Ex46Thread my1 = new Ex46Thread();
		Ex46Thread my2 = new Ex46Thread();
		my1.run(); // 처음 요청이 모두 처리되면 
		my2.run(); // 다음 요청이 처리된다.
		*/
		
		//사용자 정의 스레드를 사용한 경우
		/*
		Ex46Thread my1 = new Ex46Thread();
		Ex46Thread my2 = new Ex46Thread();
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		t1.start();
		t2.start();
		*/
		
		new Ex46Thread("하나");
		new Ex46Thread("둘");
		System.out.println("프로그램 종료");
		
		// 실행결과에서 알 수 있듯이 스레드 2개가 동시에 실행되는 것이 아니라 번갈아서 진행되지만 속도가 빨라 동시에 진행되는 것처럼 보인다.
	}
}
