class ForExam2 
{
	public static void main(String[] args) 
	{
		int oddSum = 0, evenSum = 0;	// camelCase

		for (int i = 1; i <= 10; i++)
		{
			if(i % 2 == 1)
				oddSum = i;
			else
				evenSum = i;
		}

		System.out.println("홀수합 = " + oddSum);		// 25
		System.out.println("짝수합 = " + evenSum);		// 30
	}
}
