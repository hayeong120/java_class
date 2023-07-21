class ArrayExam1 
{
	public static void main(String[] args) 
	{
//		//1. 선언
//			int a[];	// int[] a;
//
//		//2. 생성
//			a = new int[3];
//
//		//3. 초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;
//
//			System.out.println(a.length);

		
//		//1. 선언 & 생성
//			int a[] = new int[3];
//
//		//2. 초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;


//		//1. 선언 & 생성 & 초기화
			int a[] = {1, 2, 3};

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);


//		int a[];
//		a = new int[3];
//
//		System.out.pritnln(a[0]);	// 초기화를 안하면 초기값이 나온다. 
//		System.out.println(a[1]);
//		System.out.println(a[2]);

		for (int i=0; i<a.length; i++)		// 조건식에는 a.length 쓰기
		{
//			System.out.println(i);		// a = 0, 1, 2 
			System.out.println(a[i]);	// a = 1, 2, 3
		}


//		int a[];
//		a = new int[3];
//
//		System.out.pritnln(a[0]+1);


	}
}
