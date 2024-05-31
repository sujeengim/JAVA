//***************************
// 파일명: Thread1.java
// 작성자: 김수진
// 작성일: 24.05.31.
// 내용: 스레드 클래스 메소드들을 사용해본다. sleep, join, runnable
//***************************
public class Thread1 implements Runnable {
	public void run() {//runnable 사용시 run 메소드 필수 작성
		String t1List[] = {"apple", "basket", "candy", "dog"} ;
		for (int i = 0; i<t1List.length; i++) {
			System.out.println(t1List[i]);
			long randomMs = 1+(long)(Math.random()*1000);
			try { //thread 클래스는 throws 아닌 try catch 로 예외처리
				Thread.sleep(randomMs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
