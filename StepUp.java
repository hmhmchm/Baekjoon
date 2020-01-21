import java.util.Scanner;

public class StepUp {

	public static void main(String[] args) {
		int n,count = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i = 0; i < n; i ++) {
			count++;
			System.out.println(count);
		}

	}

}
