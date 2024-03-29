// 사칙연산 프로그램 (if-else 사용)
import java.util.Scanner;

public class Condition12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		Double x = sc.nextDouble();
		String cal = sc.next();
		Double y = sc.nextDouble();

		
		if (cal.equals("+")) 
			System.out.println(x+y);
			
		else if (cal.equals("-")) 
			System.out.println(x-y);
		
		else if (cal.equals("*")) 
			System.out.println(x*y); 
		
		else if (cal.equals("/")) {
			//if (y.equals(0)) //--> 0과 0.0은 다르게 인식
			if (y == 0) //-->0과 0.0은 같게 인식
				System.out.println("0으로 나눌 수 없음");
			else
				System.out.println(x/y);
		}
		
		else
			System.out.println("계산 불가");	
		
		sc.close();

	}

}
