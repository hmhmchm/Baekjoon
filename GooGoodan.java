import java.util.Scanner;

public class Googoodan {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(int i = 0; i < 9 ; i++) {
			System.out.println(n + " * " + (i+1) + " = " + (n * (i+1)));
		}
		
	}

}
