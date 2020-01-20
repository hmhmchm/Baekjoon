import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int score;
		Scanner in = new Scanner(System.in);
		score = in.nextInt();
		if(score <= 100 && score >=90) {
			System.out.println("A");
		}else if(score < 90 && score >=80) {
			System.out.println("B");
		}else if(score < 80 && score >=70) {
			System.out.println("C");
		}else if(score < 70 && score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
