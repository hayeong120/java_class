
public class While_Study_03 {

	public static void main(String[] args) {
		// while문을 이용해서 
		// -1 3 -5 7 -9 11 ...... 99
		// 까지 출력하고, 그 합계도 출력하시오.
		
		int num=1, sum=0;
		while(num<100) {
			System.out.print(-num + " ");
			sum -= num;
			num +=2;
			System.out.print(num + " ");
			sum +=num;
			num += 2;
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		
//		int cnt=1; 
//		int i=1, sum=0;
//		while(i<100) {
//			if(cnt%2==1) {
//				System.out.print(-i + " ");
//				sum += (-i);
//			}
//			else {
//				System.out.print(i + " ");
//				sum +=i;
//			}
//			i += 2;
//			cnt++;
//		}
//		System.out.println();
//		System.out.println("총 합계 = " + sum);
		
	}

}
