import java.util.Scanner;

public class Array_Study_07 {

	public static void main(String[] args) {
		// 7개의 정수값을 키보드로부터 입력받아 배열에 저장한 후 
		// 원본데이터, 최대값, 최소값을 출력하시오.
		
		int score[] = new int[7];
		int max = score[0];
		int min = score[0];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(i==0) 
				min = score[i];
			
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
			
		}
		
		System.out.print("원본데이터 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

}