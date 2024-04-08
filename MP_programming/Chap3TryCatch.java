import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap3TryCatch {

	public static void main(String[] args) {
		
		int cnt;
		Scanner scanner = new Scanner(System.in);

		do {
			cnt = 0;
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
			}
			catch (InputMismatchException e) { //ctrl+shift+o : 자동으로 import 해줌
				System.out.println("실수를 입력하면 안됩니다. ");
				scanner.nextLine(); //scanner 입력 버퍼 지우기. (입력된 값이 에러로 인해 변수에 저장되지 않고 버퍼에 남게 됨. )
				cnt += 1;
			}
		} while(cnt == 1);
		
		scanner.close();
	}
}
