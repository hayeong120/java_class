class Array_Study_01 
{
	public static void main(String[] args) 
	{
		int score[] = {100, 88, 100, 100, 90};
		int sum = 0;
		float average = 0.0f;

//		sum = score[0] + score[1] + score[2] + score[3] + score[4];

		for (int i=0; i<score.length; i++)
		{
//			System.out.println(i);	
			sum += score[i];
		}

		average = (float)sum / score.length;
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + average);

	}
}
