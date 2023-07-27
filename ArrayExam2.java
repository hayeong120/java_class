class ArrayExam2
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};		// 선언 & 생성 & 초기화

		System.out.println(a.length);
		//System.out.println(a[5]);	// ArrayIndexOutofBoundsException

		for (int i=0; i<a.length; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
