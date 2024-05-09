//***************************

// 파일명: StudentMain.java

// 작성자: 김수진

// 작성일: 2024.5.10.

// 내용: 상속, 메소드, 오버라이드 연습

//***************************
public class StudentMain {

	public static void main(String[] args) {
		System.out.println("hw6_1: 김수진");
		
		Student generalStudent = new Student("Kim",20);
		ForeignStudent foreignStudent = new ForeignStudent("Jobs", 5, "USA");
		VisitingStudent visitingStudent = new VisitingStudent("Lee", 8, "강원대");

		generalStudent.print();
		foreignStudent.print();
		visitingStudent.print();
		
		int sumTuition = generalStudent.calcTuition() + foreignStudent.calcTuition() + visitingStudent.calcTuition();
		System.out.println("등록금 합 = "+sumTuition);
	}

}
