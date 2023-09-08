import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1;
//		System.out.println(com);
		
		int cnt=0;
		while(true) {
			System.out.print("1~100사이의 정수 입력 : ");
			int num = sc.nextInt();
			if(num<com)
				System.out.println("그 보다 큰 수입니다.");
			else if(num>com)
				System.out.println("그 보다 작은 수입니다.");
			else {
				System.out.println("정답입니다!");
				break;
			}
			cnt++;
		}
		System.out.print(cnt + "번째만에 맞췄습니다!");
		if (cnt<=1 || cnt>=4)
			System.out.println("Great!");
		else if (cnt<=5 || cnt>=8)
			System.out.println("Good!");
		else
			System.out.println("노력하세요!");

	}

}
