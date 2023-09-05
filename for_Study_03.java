import java.util.Scanner;

public class for_Study_03 {

	public static void main(String[] args) {
		// (문제) 두 개의 주사위를 던졌을 때, 합이 6이 되는 
		// 모든 경우의 수를 출력하고 그 횟수를 출력하세요.
		
//		int cnt=0;
//		for (int i=1; i<=6; i++) {
//			for (int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.println(i + ", " + j);
//					cnt++;
//				} // if
//			} // for j
//		} // for i
//		System.out.println("경우의 수 : " + cnt + "가지");
		
		
		// (문제) 문자형 숫자를 입력받아서, 그 수들의 합을 구하시오. 
		
//		int sum=0;
//		Scanner sc = new Scanner(System.in);
//		String num = sc.next();
////		System.out.println(num.length());
//		
//		for(int i=0; i<num.length(); i++) {
////			System.out.println(num.charAt(i));
//			sum += num.charAt(i) - 48; // - '0'
//		}	
//		System.out.println("합 = " + sum);
		
		
		// (문제) 정수를 입력받아 각 자릿수의 합을 구하시오. 
		
		int sum=0; 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("합 = " + sum);
	}
}
