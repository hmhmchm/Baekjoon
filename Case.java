import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		int t;
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("Case #" +(i+1)+": "+ a + " + " + b + " = " + (a+b));
		}

	}

}
