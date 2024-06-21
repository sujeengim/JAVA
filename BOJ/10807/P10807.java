//틀린이유:  n개의 정수가 랜덤이 아닌 직접 입력이어야 함
package p10807;

import java.util.*;

//설명: 총 n개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하기
public class P10807 {

	public static void main(String[] args) {
		//n 입력받기 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//n만큼 정수 생성
		Random rdGen = new Random();
		List<Integer> n_list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			n_list.add(rdGen.nextInt(201)-100); //0~200에서 100씩 빼어 -100~10을 만든다. 
			//n_list.add(rdGen.nextInt(21)-10); //test
			System.out.print(n_list.get(i)+" ");
		}
		System.out.print("\n");

		
		//찾고 싶은 v 입력받기 
		int v = sc.nextInt();
		
		//n_list중 v 몇개인지 출력
		System.out.println(Collections.frequency(n_list, v));
		

	}

}
