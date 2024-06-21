package p10807;

import java.util.*;

//설명: 총 n개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하기
public class Main {

	public static void main(String[] args) {
		//n 입력받기 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n만큼 정수 생성
		List<Integer> n_list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			n_list.add(sc.nextInt()); //공백으로 구분하여 입력 or 줄바꿈으로 구분하여 입력
		}

		
		//찾고 싶은 v 입력받기 
		int v = sc.nextInt();
		
		//n_list중 v 몇개인지 출력
		System.out.println(Collections.frequency(n_list, v));

		

	}

}
