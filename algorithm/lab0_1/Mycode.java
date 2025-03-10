package lab0_1;
import java.util.Scanner;

public class Mycode {

	public static void main(String[] args) {
		System.out.println("lab0_1:김수진");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lb = sc.nextInt();
		int nb = sc.nextInt();
		
		int[] rangelist = new int[nb-lb+1];
//		int[] numberlist = new int[n];
		int[] countlist = new int[nb-lb+1];

		int cnt = 0;
		for (int i=0;i<rangelist.length;i++) {
			rangelist[i] = lb+cnt;
			cnt++;
		}
		for (int i=0;i<n;i++) {
			int test = sc.nextInt();
			for (int r=0;r<rangelist.length;r++) {
				if(test==rangelist[r]) {
					countlist[r]++;
				}
			}
		}

		/*//랜덤으로 n개 뽑는 방법
		for (int i=0;i<n;i++) {
			int test = (int)(Math.random()*201-100); //-100~100
			System.out.printf(test + " "); 

			for (int r=0;r<rangelist.length;r++) {
				if (test==rangelist[r]) {
					countlist[r]++;
				}
				
			}
		}
		*/
		
		for (int i:countlist) {
			System.out.printf(i + " ");
		}

		sc.close();
		

	}

}
