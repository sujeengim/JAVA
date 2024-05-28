//***************************
// 파일명: CombTest.java
// 작성자: 김수진
// 작성일: 24.05.28.
// 내용: 자바 컬렉션 라이브러리 HashSet 연습
//***************************

import java.util.HashSet;
public class CombTest {

	public static void main(String[] args) {
		System.out.println("hw13_1: 김수진\n");		
		
		String[] questionBank = { //문자열 배열 생성
				"파란색이 영어로 무엇인가?", 
				"빨간색이 영어로 무엇인가?", 
				"사과는 영어로 무엇인가?",
				"한국의 수도는?",
				"일본의 수도는?",
				"1+2는?", 
				"9-3은?",
				"99-33은?",
				"3*2는?",
				"12/3은?",
				};
		
		
		HashSet<String> comb = new HashSet<String>(); //hashset 객체 생성
		
		while (comb.size() < 5) { //셋의 크기 5까지
			int n = (int) (Math.random() * questionBank.length); //랜덤 문제 추출
			if (comb.contains(questionBank[n]) == false) //셋에 포함되어 있지 않은 문제만 add
				comb.add(questionBank[n]);
		}
		
		int i=1; //셋 순서 --> 순서 반환해주는 메소드 존재?
		for (String element : comb) { //향상된 for 
			System.out.println(i+") "+element+"\n");
			i++;
		}

	}

}
