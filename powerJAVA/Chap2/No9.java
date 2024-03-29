//최대 2자리 10진수 입력받고, 2진수로 변환하여 출력하는 프로그램

import java.util.Scanner;

public class No9 {
		//최대 2자리 정수라면, 99까지가 최대이며, 2로 7번까지 나눌 수 있음
		//2로 더이상 나눠지지 않으면 나눈 값은 0이 나옴
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //입력 받기 위한 세팅

		System.out.println("정수:"); 

		int n = sc.nextInt(); // 입력 받은 정수 저장 변수
		int m; //나눌 값 저장 변수
		
		String binary = ""; //나머지 저장할 문자열 변수
	
		m = n/2; //현재 단계에서 계산 중인 값:n, 이후 단계에서 계산해야할 값:m
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		n = m;
		
		m = n/2;
		binary = (n%2)+binary;
		
		System.out.println(binary);
		
		
		
	}		

}
