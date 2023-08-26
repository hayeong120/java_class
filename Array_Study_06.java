import java.util.Scanner;

public class Array_Study_06 {

	public static void main(String[] args) {
		// String 배열에 자기가 좋아하는 연예인 5명의 이름을 입력받아 넣고
		// 그중에 짝수번째 연예인만 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		
		for (int i = 0; i < str.length; i++) {
			System.out.print((i+1) + "번 연예인 이름 : ");
			str[i] = sc.next();
		}
		
		for (int i = 1; i < str.length; i+=2) {
			System.out.println(str[i]);
		} 
		

	}

}
