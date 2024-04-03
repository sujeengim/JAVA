//***************************
// 파일명: hw3_1.java
// 작성자: 김수진
// 작성일: 24.04.03. 
// 내용: 숫자를 입력 받아 해당 게절을 출력하는 프로그램
//***************************

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("hw3_1 : 김수진");

		int flag; //잘못 입력한 경우 체크
		Scanner sc = new Scanner(System.in);
		do 
		{
			flag = 0; //flag==0인 경우 반복 x
			System.out.print("숫자 입력: ");
			int seasonNumber = sc.nextInt();			
			
			switch (seasonNumber) 
			{
				case 1,2,12 -> System.out.println("계절: 겨울"); //입력 받은 seasonNumber가 1,2,12인 경우 겨울 출력
				case 3,4,5 -> System.out.println("계절: 봄"); 
				case 6,7,8 -> System.out.println("계절: 여름");
				case 9,10,11 -> System.out.println("계절: 가을");
				default -> {
					flag = 1; 
					System.out.println("잘못된 입력입니다.");
				} //잘못 입력한 경우 반복문 실행
			} 
		} while (flag == 1);
		System.out.print("프로그램을 종료합니다.");
		sc.close();

	}

}
