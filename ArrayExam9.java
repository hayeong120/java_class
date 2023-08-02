class ArrayExam9 
{
	public static void main(String[] args) 
	{
		int a[];	// 통일하기
		int b[];
		int c[] = {31, 32, 33};
		a = new int [4];
		b = new int[] {21, 22, 23, 24};		// new int[]를 지우면 error

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

		c = b;

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

	}
}
