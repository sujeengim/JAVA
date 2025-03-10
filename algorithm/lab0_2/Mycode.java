package lab0_2;
import java.util.Scanner;

public class Mycode {

	public static void main(String[] args) {
		System.out.println("lab0_2:김수진");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[] array = {
				20, 40, 60, 80, 100, 
				110, 120, 130, 150, 
				190, 200, 300, 400
		};
		
		System.out.println(binarySearch(array, 0, array.length-1, n));
		
		sc.close();
	}
	
	
	public static int binarySearch(int[] array, int from, int to, int item) {
		//1. 정렬
		//2. 중간점 설정
		if (from > to) {
			return -1;
		}
		
		int mid = (from + to) /2;
		
		//3. 이진탐색(재귀)
		if (array[mid] == item) {
			return mid;
		} 
		else { //from과 to를 고정해야하는 이유?
			if (array[mid] > item) {
				return binarySearch(array, from, mid-1, item);
			} else {
				return binarySearch(array, mid+1, to, item);
			}
		}
		
		
	}

}
