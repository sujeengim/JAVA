//***************************
//파일명 : Expression.java
//작성자 : 김수진
//작성일 : 24.03.22. (금)
//내용 : 정수 x와 y를 입력 받아 여러 연산을 처리하는 프로그램
//***************************

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hw2_1: 김수진");
		
		Scanner c = new Scanner(System.in);
		int x, y;
		
		System.out.print("x 입력 :");
		x = c.nextInt();
		System.out.print("y 입력 :");
		y = c.nextInt();
		
		System.out.println("x와 y 덧셈 " + (x+y));
		System.out.println("x에서 y 뺄셈 " +(x-y));
		System.out.println("x와 y 곱셈 " + (x*y));
		System.out.println("x에서 y 나눗셈 " + (x/y));
		System.out.println("x를 y로 나눈 나머지 "+(x%y));
		System.out.println("x를 y비트만큼 왼쪽으로 시프트 " + (x << y));
	}

}