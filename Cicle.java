import java.util.Scanner;

public class Cicle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();;//주어진 수
	 
		int count = 0; //몇번 돌았는가 
		int temp = 0;// 두 번째 자리 임시 저장 
		int one = n/10;// 10의자리 수
		int two = n%10;// 1의 자리 수
		
		while(true) {
			count ++; // count 하나 씩 올리고
			temp = two; // 먼저 1의 자리 수 미리 저장소에 저장
			two = (one + two) % 10; // 새롭게 1의 자리수 계산해 구하고
			one = temp; // 아까 two를 temp 에 저장해놨던 것을 다시 꺼내서 one 에 저장 
			
			if(n == one * 10 + two) { // 처음 수와 사이클 돌고 나서 같으면 멈춘다.
				break;
			}
			
		
		}
		System.out.println(count);
	}

}
