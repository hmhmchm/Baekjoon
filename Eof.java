package programming_01;

import java.util.Scanner;

public class Eof {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt()) { // 자바  EOF 처리 @@
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a + b);
		}

	}

}
