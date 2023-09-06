import java.util.Scanner;

public class for_Study_04 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		// 일반적인 for문
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 향상된 for문(배열만 사용가능)
		//for(배열의데이터 Type : 배열의이름)
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		
		// (문제) i번째 피보나치 수열 구하기
//		
//		int n1=1, n2=1, n3=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("i번째 피보나치 수열 입력(i값 입력) : ");
//		int num = sc.nextInt();
//		
//		for (int i=0; i<num; i++) {
//			System.out.print(n1 + " ");
//			n3 = n1 + n2;
//			n1 = n2;
//			n2 = n3;
//		}
		
		// (문제) 1~100사이의 숫자 중 3의 배수이면서 
		//동시에 5의 배수인 수의 갯수와 총합을 출력하시오.
//		
//		int cnt=0, sum=0; 
//		
//		for(int i=1; i<=100; i++) {
//			if(i%3==0 && i%5==0) {
//				cnt++;
//				sum += i;
//			}
//		}
//		System.out.println("3의 배수이면서 5의 배수인 수의 갯수 : " + cnt);
//		System.out.println("3의 배수이면서 5의 배수인 수의 총합 : " + sum);

	}

}
