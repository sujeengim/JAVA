//***************************

// 파일명: ForeignStudent.java

// 작성자: 김수진

// 작성일: 2024.5.10.

// 내용: 상속, 메소드, 오버라이드 연습
public class ForeignStudent extends Student {
	private String nationality;
	
	public ForeignStudent(String name, int credit, String nationality) {
		super(name, credit);
		this.getNationality(nationality);
	}
	public String getNation() {
		return this.nationality;
	}
	public void getNationality(String nationality) {
		this.nationality = nationality;
	}
	public void print() {
		System.out.println("이름:"+this.name+"  신청학점수:"+this.credit+"  국적:"+this.nationality);
	}
}
