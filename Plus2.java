import java.util.Scanner;

public class Plus2 {

	public static void main(String[] args) {
		int a = 0,b = 0;// 입력받을 두 정수
		Scanner in = new Scanner(System.in);
		while(true) {
			a = in.nextInt();
			b = in.nextInt();
			if(a == 0 && b == 0) {
				System.out.print("");
				break;
			}
			System.out.println(a+b);
		}		
	}

}
