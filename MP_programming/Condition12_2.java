// 사칙연산 프로그램 (switch 사용)

import java.util.Scanner;
public class Condition12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		Double x = sc.nextDouble();
		String cal = sc.next();
		Double y = sc.nextDouble();
		
		switch(cal) { 
		
		case "+":
			System.out.println(x+y);
			break;
			
		case "-":
			System.out.println(x-y);
			break;
			
		case "*":
			System.out.println(x*y);
			break;
			
		case "/":
			if (y == 0) {
				System.out.println("0으로 나눌 수 없음");break;
			}
			System.out.println(x/y);
			break;
			
		default:
			System.out.println("계산 불가");
		}
		
		sc.close();
	}

}
