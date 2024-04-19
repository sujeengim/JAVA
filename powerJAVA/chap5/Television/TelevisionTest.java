//***************************
// 파일명: TelevisionTest.java
// 작성자: 김수진
// 작성일: 2024.04.19.
// 내용: 텔레비전 객체 생성 및 수와 정보를 출력
//***************************

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw5_1: 김수진");
		
		///tv 객체수 출력
		System.out.println("객체 수: " + Television.getNumberOfTVs());
		
		//텔레비젼 객체 tv1,2,3을 생성
		Television tv1 = new Television();
		Television tv2 = new Television("Jesus");
		Television tv3 = new Television("Popular", 5000000);
		
		 System.out.println(tv1.toString()); // System.out.println(tv1); 으로 해도 됨
		 System.out.println(tv2.toString()); 
		 System.out.println(tv3.toString()); 
		
		 ///tv 객체수 출력
		 System.out.println("객체 수: " + Television.getNumberOfTVs());
	}

}
