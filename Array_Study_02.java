class Array_Study_02 
{
	public static void main(String[] args) 
	{
		int score[] = {79, 88, 91, 33, 100, 55, 95};
		int max = score[0];		// max = 79
		int min = score[0];

		for (int i=0; i<score.length; i++)
		{
//			System.out.println(score[i]);
			if (score[i] > max)
				max = score[i];
			if (score[i] < min)
				min = score[i];
		}	// for

		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}
}
