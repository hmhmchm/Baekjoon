import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		int hour,min;
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		min = in.nextInt();
		
		if(hour !=0) {
			if(min < 45) {
				System.out.print(hour-1 + " ");
				System.out.println(min+15);
				
			}else {
				System.out.print(hour + " ");
				System.out.println(min-45);
			}
		}else {
			if(min < 45) {
				System.out.print("23 ");
				System.out.println(min+15);
				
			}else {
				System.out.print("0 ");
				System.out.println(min-45);
			}
		}

	}

}
