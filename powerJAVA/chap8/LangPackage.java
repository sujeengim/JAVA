//***************************
// 파일명: LangPackage.java
// 작성자: 김수진
// 작성일: 24.05.17.
// 내용: java.lang 패키지 연습(math, wrapper)
//***************************
import java.util.Scanner;
public class LangPackage {

	public static void main(String[] args) {
		System.out.println("hw8_1: 김수진");
		
		// 원 면적
		System.out.println((1.5)*(1.5)*Math.PI);
		//3의 10승
		System.out.println(Math.pow(3, 10));
		//루트8
		System.out.println(Math.sqrt(8));
		
		
		//주민등록번호 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력(-포함): ");
		String id = sc.next();
		sc.close();
		//주민등록번호 분리
		String[] splitID = id.split("-");
		//문자열->정수 변환
		int id1 = Integer.valueOf(splitID[0]);
		int id2 = Integer.valueOf(splitID[1]);
		//결과 출력
		System.out.println("앞자리 = "+id1);
		System.out.println("뒷자리 = "+id2);
		System.out.println("합 = "+(id1+id2));
		

	}

}
