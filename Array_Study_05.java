import java.util.Scanner;

public class Array_Study_05 {

	public static void main(String[] args) {
		
//		// 5명의 학생의 점수를 입력받아 배열에 저장한 후, 총점과 평균을 구하시오.
//		Scanner sc = new Scanner(System.in);
//		int scores[] = new int[5];
//		
//		int sum = 0;
//		for (int i=0; i<scores.length; i++) {
//			System.out.print((i+1) + "반 학생의 점수를 입력하세요 : ");
//			scores[i] = sc.nextInt();
//			sum += scores[i];
//		}
//		System.out.println("총점 = " + sum);
//		System.out.println("평균 = " + sum/(double)scores.length);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		int su = sc.nextInt();
		int totalSum = 0;	//전체 총전
		int totalAvg = 0;	//전체 평균
		
		String name[] = new String[su];
		int score[][] = new int[su][5];
		
		for (int i=0; i<su; i++) {	// su = name.length = score.length
			System.out.print((i+1) + "번 학생 이름 : ");
			name[i] = sc.next();
			System.out.print("국어 점수 : ");
			score[i][0] = sc.nextInt();
			System.out.print("영어 점수 : ");
			score[i][1] = sc.nextInt();
			System.out.print("수학 점수 : ");
			score[i][2] = sc.nextInt();
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = score[i][3]/3;
			
			totalSum += score[i][3];
			totalAvg += score[i][4];
		}
		
		System.out.println("============================================");
		System.out.println("이름     국어	영어     수학   총점   평균");
		System.out.println("============================================");
		
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j=0; j<5; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("======================================");
		System.out.println("전체 총점 = " + totalSum);
		System.out.println("전체 평균 = " + totalAvg/su);
		
	}
}
