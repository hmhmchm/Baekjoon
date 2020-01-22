public class Star {

	public static void main(String[] args) {
		int num; //0 ~ num 까지 별의 개수 출력
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		for(int i = 1; i < num +1 ; i++) {
			for(int j = 0; j < num -i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i ; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
