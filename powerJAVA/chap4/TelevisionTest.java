//***************************
// 파일명: TelevisionTest.java
// 작성자: 김수진
// 작성일: 2024.04.19.
// 내용: 텔레비전 클래스에 생성자를 정의하고, 텔레비전 객체 정보를 출력
//***************************

class Television {
	private String model;
	private int price;
	
	//모델명의 getter와 setter
	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}
	//가격의 getter와 setter
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	//생성자1, 기본생성자
	Television() {
		model = "MyTV";
		//설정하지 않은 가격필드는 int형이므로 0(기본값)으로 초기화
	}
	//생성자2
	Television(String model) {
		this(model, 0);
	}
	//생성자3
	Television(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	//기본할인, 10% 할인
	public void discount() {
		price = price - (int)(price*0.1);
	}
	//정액할인, 매개변수만큼 할인
	public void discount(int cut) {
		price = price - cut;
	}
	//tv정보 리턴
    public String toString() {
        return "모델명:" + model + " 가격:" + price;
    } 
	
}
public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw4_2: 김수진");
		
		//텔레비젼 객체 tv1,2,3을 생성
		Television tv1 = new Television();
		Television tv2 = new Television("Jesus");
		Television tv3 = new Television("Popular", 5000000);
		
		 System.out.println(tv1.toString()); // System.out.println(tv1); 으로 해도 됨
		 System.out.println(tv2.toString()); 
		 System.out.println(tv3.toString()); 

	}

}
