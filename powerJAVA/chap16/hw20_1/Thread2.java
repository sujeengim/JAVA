//***************************
// 파일명: Thread2.java --> thread1과 비슷
// 작성자: 김수진
// 작성일: 24.05.31.
// 내용: 스레드 클래스 메소드들을 사용해본다. sleep, join, runnable
//***************************
public class Thread2 implements Runnable{
	public void run() {
		String t2List[] = {"사과", "바구니", "사탕", "개"};
		for(int i=0;i<t2List.length;i++) {
			System.out.println(t2List[i]);
			long randomMs = 1+(long)(Math.random()*1000);
			try {
				Thread.sleep(randomMs);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
