//***************************
// 파일명: Driver.java
// 작성자: 김수진
// 작성일: 24.5.14.
// 내용: 익명 클래스 연습
//***************************

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw7_2: 김수진");
		
		//Dog 클래스 기능하는 익명클래스 생성
		Speakable dog = new Speakable() {
			public void speak() {
				System.out.println("멍멍");
			}
		};
		dog.speak();
		//AlarmClock 클래스 기능하는 익명클래스 생성
		Speakable alarmClock = new Speakable() {
			private int number = 5;
			public void speak() {
				for(int i=0; i<number; i++)
					System.out.print("삐");
				System.out.println();
				number = number + 3;
			}
		};
		alarmClock.speak();
		alarmClock.speak();
	}

}
