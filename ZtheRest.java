import java.util.Scanner;

public class TheRest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] rest = new int[10]; //나머지 배열 생성
		//int[] bowl = new int[10]; 
		int count; // 나머지 몇갠지 카운트 
		for(int i = 0; i < rest.length; i++) {
			rest[i] = in.nextInt()%42;//여기에 42 나눈 나머지 값 저장하고
		}
		
		for(int i = 0; i < rest.length; i++) {//입력한 수에 겹치는 부분이 있다면 카운트 세지않고 넘긴다
			if(  ) //수정 필요
		}
	}

}
