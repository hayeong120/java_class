import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class While_Study_02 {

	public static void main(String[] args) {
		// (문제) while문을 이용해서 1부터 값을 누적하여  
		// 누적합계가 100을 넘기는 수와 그 합을 출력하시오. 
		
//		int i=0, sum=0;
//		while(sum<100) {
//			//i++;
//			sum += ++i;
//		}
//		System.out.println("누적합계가 100을 넘는 수 : " + i);
//		System.out.println("누적합계 : " + sum);

		// (문제) 사용자로부터 정수를 입력받아서, 그 수의 모든 약수를 출력하시오. 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력받을 정수 : ");
//		int num = sc.nextInt();
//		
//		int i=1;
//		while(i<=num) {
//			if(num%i==0)
//				System.out.print(i + " ");
//			i++;
//		}
		
		// (문제) whlie문을 이용하여 0~100 사이의 임의의 정수를 여러개 입력받아서,
		// 입력받은 정수의 갯수, 합계, 평균을 출력하시오.
		// 단, 0보다 작은 값이 입력되면 프로그램은 종료되고 
		// 100보다 큰 값이 입력되면 갯수, 합계, 평균에서 제외할 것
		
		int num=0, cnt=0, sum=0; 
		double avg=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			num = sc.nextInt();
			if(num<0) break;
			else if (num>100) continue; 
			else {
				cnt++;
				sum += num;
			}	
		} // while
		avg = (double)sum/cnt;
		
		System.out.println("입력한 수의 갯수 : " + cnt);
		System.out.println("입력한 수의 합계 : " + sum);
		System.out.println("입력한 수의 평균 : " + avg);
		
	}

}
