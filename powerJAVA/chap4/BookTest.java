//***************************
// 파일명: ClassTest.java
// 작성자: 김수진
// 작성일: 24.04.10.
// 내용: 책을 나타내는 Book 클래스를 정의하고 이를 이용한 프로그램
//***************************

//Book 클래스 정의
class Book { 
	public String name; //책 제목 필드
	public double price; //책 가격 필드
	public int year; //책 발행연도 필드
  
	//제목, 가격, 발행연도 출력 메소드	
	public void print() { 
		System.out.println("제목: "+ name + " 가격: " + price + " 발행연도: " + year); //책이름, 가격, 발행연도 문자열 반환
	}
  //발행연도 2014이면 10% 할인, 그 전이면 50% 할인 메소드
	public double discount() { 
		if (year==2014){
			price = price-(price*0.1);
			return price;
		}
		else if (year < 2014) {
			price = price-(price*0.5);
			return price;
		}
		else {
			return price;
		}
	}
  //매개변수만큼 할인 메소드
	public double discount(double cut) { 
		price = price-cut;
		return price;
	}
}

public class BookTest { //BookTest public 클래스 정의
	public static void main(String[] args) {
    System.out.println("hw4_1: 김수진");
    
		//myBook 객체 생성 및 정보 입력
		Book myBook = new Book(); 
		myBook.name = "java";
		myBook.price = 10000;
		myBook.year = 2014;
		
		//yourBook 객체 생성 및 정보 입력
		Book yourBook = new Book(); 
		yourBook.name = "database";
		yourBook.price = 20000;
		yourBook.year = 2013;
		
		//ourBook 객체 생성 및 정보 입력
		Book ourBook = new Book(); 
		ourBook.name = "computer";
		ourBook.price = 30000;
		ourBook.year = 2009;
		
		//정보 출력
		myBook.print(); //System.out.println(myBook)은 주소 출력하는 것 같음
		yourBook.print();
		ourBook.print();
		System.out.println();
		
		//1000원 정액할인
		myBook.discount(1000);
		yourBook.discount(1000);
		ourBook.discount(1000);
		
		///재고할인
		myBook.discount();
		yourBook.discount();
		ourBook.discount();
		
		//정보출력
		myBook.print();
		yourBook.print();
		ourBook.print();
	}
}
