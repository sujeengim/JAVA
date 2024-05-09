//***************************

// 파일명: Student.java

// 작성자: 김수진

// 작성일: 2024.5.10.

// 내용: 상속, 메소드, 오버라이드 연습
public class Student {

	//protected : 부모자식 클래스만 사용가능한 멤버
	protected String name;
	protected int credit;
	
	//이름과 신청학점수 설정하는 생성자
	public Student(String name, int credit) {
		this.setName(name);
		this.setCredit(credit);
	}
	//이름  getter와 setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//신청학점수 getter와 setter
	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	//등록금계산
	public int calcTuition() {
		if (this.credit > 6)
			return 3000000;
		else
			return (this.credit * 200000);
	}
	//이름과 신청학점수 출력
	public void print() {
		System.out.println("이름:"+this.name+"  신청학점수:"+this.credit);
		//위아래 차이
		//System.out.println("2이름:"+name+"  신청학점수:"+credit);
	}

}
