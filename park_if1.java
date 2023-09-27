import java.util.Scanner;	//스캐너를 사용하기 위해 작성

class park_if1 
{
	public static void main(String[] args) 
	{
		char input;
		Scanner sc = new Scanner(System.in);	//스캐너 선언 


		System.out.print("박원 선생님은 잘생겼나요? Y/N : ");
		input = sc.next().charAt(0);
		

		if ( input == 'y' || input == 'Y')
		{
			System.out.println("박원 선생님은 잘생겼군요!");
		}
		else if ( input == 'n' || input == 'N')
		{
			System.out.println("ㅡㅡ");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
