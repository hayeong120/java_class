class SwitchExam1 
{
	public static void main(String[] args) 
	{
		int a = 20, b = 10;
		char op = '/';

		switch(op)
		{
			case '+' : 
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case '-' : 
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case '*' : 
				System.out.println(a + " * " + b + " = " + (a*b));
				break;
			case '/' : 
				System.out.println(a + " / " + b + " = " + (a/b));
				break;
			default : 
				System.out.println("사칙연산자만 입력해주세요.");
				break;		// 안 써도 되지만 쓰는 것을 추천

		}	// switch

	}	// main
}
