import java.util.Scanner;

public class StepDown {

	public static void main(String[] args) {
		int n = 0;
		int count = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		count = n ;
		for(int i = 0; i < n; i++) {
			System.out.println(count);
			count --;
		}

	}

}
