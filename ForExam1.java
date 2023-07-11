class ForExam1 
{
	public static void main(String[] args) 
	{
////		int i;

		for (int i = 1; i <= 5; i++)	// 여기선 ++i여도 상관X
		{
			System.out.print(i + "\t");
		}	
		System.out.println();	// line feed

////		System.out.println("i값 = " + i);


		for (int i = 1; i <= 10; i = i + 3)		// i += 3
		{
			System.out.print(i + "\t");
		}
		System.out.println();

		for (int i = 10; i >= 5; i--)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}