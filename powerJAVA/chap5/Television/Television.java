//***************************
// 파일명: Television.java
// 작성자: 김수진
// 작성일: 2024.04.19.
// 내용: 텔레비전 클래스에 생성자를 정의하고, 
//      정적 멤버/메소드 사용
//***************************

public class Television {
	private String model;
	private int price;
	
	//모델명의 getter와 setter
	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}
	//가격의 getter와 setter
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	//정적 변수 생성 및 0으로 초기화
	static int numberOfTVs = 0;
	
	//생성자1, 기본생성자
	Television() {
		model = "MyTV"; //설정하지 않은 가격필드는 int형이므로 0(기본값)으로 초기화
		numberOfTVs ++;
	}
	//생성자2
	Television(String model) {
		this.model = model;
		price = 0;
		numberOfTVs ++;
	}
	//생성자3
	Television(String model, int price) {
		this.model = model;
		this.price = price;
		numberOfTVs ++;
	}
	
	//기본할인, 10% 할인
	public void discount() {
		this.price *= 0.9;
//		price = price - (int)(price*0.1);
//		price = price - (price*0.1); -->에러
//		this.price = price*0.9; --> 에러
	}
	//정액할인, 매개변수만큼 할인
	public void discount(int cut) {
		price = price - cut;
	}
	//tv정보 리턴
    public String toString() {
        return "모델명:" + model + " 가격:" + price;
    } 
    // TV객체수 리턴
    public static int getNumberOfTVs() {
    	return numberOfTVs;
    }
	
}
