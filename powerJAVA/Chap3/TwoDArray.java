// 문제점 : r, c가 같아 두 번 이상 같은 곳에 1이 저장될 경우 배열 안에 5개의 1이 채워지지 않음. 

public class TwoDArray {

	public static void main(String[] args) {
		int a[][] = new int[3][5]; //new 하면 0으로 초기화 되어 있는듯
		
		for (int i=0; i<5; i++) {
			int r = (int)(Math.random()*3); //0.0 <= x < 1.0(*3)의 난수 생성
			int c = (int)(Math.random()*5); //0.0 <= x < 1.0(*5)의 난수 생성
			
			a[r][c] = 1;
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(a[i][j]+" ");//배열이 아닌 배열의 특정 위치를 출력해야함. 배열 출력시 배열 저장 주소 위치 나옴. 
				
			}System.out.println("");
		}
		

	}

}
