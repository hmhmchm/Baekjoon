import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2;// 첫번째 세자리수 두번째 세자리수
		int num3,num4,num5; // 세번째 네번째 다섯번째 다 더하면 여섯번 째가 된다.
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		num3 = num1 * (num2%10); 
		num4 = num1 * ((num2%100) - (num2%10));
		num5 = num1 * (num2/100)*100;
		
	  System.out.println(num3);
		System.out.println(num4/10);
		System.out.println(num5/100);
		System.out.println(num3 + num4 + num5);
		
		
	}

}
