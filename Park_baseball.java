import java.util.Random;		// Random을 사용하기 위해 import
import java.util.Scanner;		// Scanner를 사용하기 위해 import

class Park_baseball 
{
	public static void main(String[] args) 
	{
		int com_hun, com_ten, com_one;		//무작위 숫자를 저장하기 위한 변수 
		int input;
		int input_hun, input_ten, input_one;	//입력한 숫자를 저장하는 변수

		int st = 0, ball = 0, out = 0;
		int count = 1;

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		com_hun = random.nextInt(10);
		
		do
		{
			com_ten = random.nextInt(10);
		}
		while (com_hun == com_ten);

		do
		{
			com_one = random.nextInt(10);
		}
		while ((com_one == com_hun) || (com_one == com_ten));		
		//일의 자리가 백의 자리와 같거'나' 십의 자리와 같으면 계속 반복해서 새로운 숫자를 배정

		System.out.println("생성된 숫자는 " + com_hun + com_ten + com_one + "입니다.");

		while (true)
		{
			System.out.print("\n3자리 숫자를 입력해 주세요 : ");
			input = sc.nextInt();

			if (input < 0 || input > 999)
						{
							System.out.println("0보다 크거나 1000보다 작은 숫자를 입력하세요.");
							continue;
						} 

			input_hun = input / 100;			//백의 자리를 구하는 식
			input_ten = (input % 100) / 10;		//십의 자리를 구하는 식
			input_one = input % 10;				//일의 자리를 구하는 식

			if (input_hun == input_ten || input_hun == input_one || input_ten == input_one)
			{
				System.out.println("중복된 숫자가 있습니다.");
				continue;
			}

			System.out.println("입력된 숫자는 : " + input_hun + input_ten + input_one + "입니다.");


			if (input_hun == com_hun)
				st++;
			else if (input_hun == com_ten || input_hun == com_one)
				ball++;
			else
				out++;

			if (input_ten == com_ten)
				st++;
			else if (input_ten == com_hun || input_ten == com_one)
				ball++;
			else
				out++;

			if (input_one == com_one)
				st++;
			else if (input_one == com_ten || input_one == com_hun)
				ball++;
			else
				out++;

			

			System.out.println("스트라이크 : " + st + ", 볼 :" + ball + ", 아웃 : " + out);

			if (st == 3 || count >= 10)
			{
				break;
				
			}

			st = 0;
			ball = 0;
			out = 0;
			count++;		//횟수 증가
		}

		if (st == 3)
			System.out.println("\n축하합니다! " + count + "번 만에 숫자를 맞췄습니다!");
		else
			System.out.println("\n숫자를 맞추지 못했습니다ㅠ.ㅜ");
	}
}