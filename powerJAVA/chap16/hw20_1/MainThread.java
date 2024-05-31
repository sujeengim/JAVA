//***************************
// 파일명: MainThread.java
// 작성자: 김수진
// 작성일: 24.05.31.
// 내용: 스레드 클래스 메소드들을 사용해본다. runnable, sleep, join사용
//***************************
public class MainThread {

	public static void main(String[] args) throws InterruptedException { //throws로 sleep 예외처리
		
		Thread t1 = new Thread(new Thread1()); //runnable 스레드(상속) 사용
		Thread t2 = new Thread(new Thread2());

    // 스레드 시작
		t1.start();
		t2.start();
		
		String msList[] =  {"1000", "2000", "3000", "4000"};
		for (int i=0;i<msList.length;i++) {
			System.out.println(msList[i]);
			long randomMs = 1+(long)(Math.random()*1000); // 랜덤 1~1000 사이 ms 
			Thread.sleep(randomMs); //스레드 랜덤 ms만큼 기다림
		}

		t1.join();//스레드1 종료까지 기다림
		System.out.println("Thread1 종료");
		t2.join();//스레드1 종료까지 기다림
		System.out.println("Thread2 종료");
	
		
	}

}
