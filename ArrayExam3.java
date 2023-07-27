class ArrayExam3
{
	public static void main(String[] args) 
	{
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int i=0; i<a.length; i++)	// 주의할 점 a.length() (X) 메소드로 처리된다. 
		{
			System.out.println(a[i]);
		}
	}
}
