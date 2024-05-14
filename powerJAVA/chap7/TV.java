//*********
// 상속 연습; TV 상속받은 ColorTV, IPTV 정의; 부모클래스의 private 멤버 가져오기
//*********

public class TV {
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+this.color+"컬러"); //부모클래스의 private 멤버 가져오기:getSize()
	}
	protected int getColor() {return color;}
}

class IPTV extends ColorTV {
	private String add;
	public IPTV(String add, int size, int color) {
		super(size, color);
		this.add = add;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 "+this.add+" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}
