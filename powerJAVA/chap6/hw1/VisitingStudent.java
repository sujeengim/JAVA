//***************************

// 파일명: VisitingStudent.java

// 작성자: 김수진

// 작성일: 2024.5.10.

// 내용: 상속, 메소드, 오버라이드 연습
public class VisitingStudent extends Student {
	private String school;
	
	public VisitingStudent(String name, int credit, String school) {
		super(name, credit);
		this.setSchool(school);
	}
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int calcTuition() {
		return (this.credit * 100000);
	}
	public void print() {
		System.out.println("이름:"+this.name+"  신청학점수:"+this.credit+"  소속학교명:"+this.school);
	}
}
