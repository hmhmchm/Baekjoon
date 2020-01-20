import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if(a != b && b != c && a != c && 1 <=a && 1<=b && 1 <= c && a <= 100 && b <= 100 && c <= 100) {
			if(a > b && a > c) {// a가 가장 클 경우
				if(b > c) {
					System.out.println(b);
				}else {
					System.out.println(c);
				}
			}else if(b > a && b > c) {// b 가 가장 클 경우
				if(a > c) {
					System.out.println(a);
				}else {
					System.out.println(c);
				}
			}else {// c가 가장 클 경우
				if(a > b) {
					System.out.println(a);
				}else {
					System.out.println(b);
				}
			}
		}else if(a == b && 1 <=a && 1<=b && 1 <= c && a <= 100 && b <= 100 && c <= 100) {
			System.out.println(a);
		}else if(b == c && 1 <=a && 1<=b && 1 <= c && a <= 100 && b <= 100 && c <= 100) {
			System.out.println(b);
		}else if(a == c && 1 <=a && 1<=b && 1 <= c && a <= 100 && b <= 100 && c <= 100) {
			System.out.println(a);
		}else {
			System.out.println(a);
		}
	}

}
