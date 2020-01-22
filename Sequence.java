import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		int n,x,a = 0; // n은 수열 a의 개수,  x는 기준 정할 정수
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); x = in.nextInt();
		for(int i = 0; i < n; i++) {
			a = in.nextInt(); //정수 n개로 수열 입력 a
			if(a < x) {
				System.out.print(a + " ");
			}
		}
	}

}
