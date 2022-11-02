// 5,13~16
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제5) 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
//	    for(int i=1;i<=6;i++)
//	    {
//	    	for(int j=1;j<=6;j++)
//	    		if(i+j==6)
//	    		{
//	    			System.out.printf("[%d,%d]",i,j);
//	    		}
//	    		System.out.println();
//	    }
		//문제13)
		/*
		 * 13. 다음 결과를 출력하는 프로그램
 
 출력예) ********** (5행10열)
		**********
		**********
		**********
		**********
 */
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
		//문제14) 11111
		/* 22222
		 * 33333
		 * 44444
		 * 55555
		 */
//		for(int i=1;i<=5;i++)
//		{	
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(i);
//			}System.out.println();
//		}
		int k=1;
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=5;j++)
			{
				System.out.print(k);	
			}k++;
			System.out.println();
		}
		//문제15)
		//문제16)
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(j);
//				
//			}System.out.println();
//		}
		for(int i=1;i<=5;i++)
		{	k=1;
			for(int j=1;j<=5;j++)
			{
				System.out.print(k++);
			}System.out.println();
		}
		//문제
		/*
		 *    *
		 *   **
		 *  ***
		 * ****
		 * 	i	j	k
		 * 	줄수	공백	별표
		 * 	1	3	1		i+j=4 ==> j=4-i	k=i
		 * 	2	2	2		
		 * 	3	1	3
		 * 	4	0	4
		 * 
		 * i&j, i&k 관계 파악하기
		 */
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4-i;j++)//공백
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)//별표
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//문제
		/*
		 * ****
		 *  ***
		 *   **
		 *    *
		 * 
		 * i	j	k
		 * 줄수	공백	별표
		 * 1	0	4	j+1=i ==> j=i-1 k=5-i
		 * 	2	1	3
		 * 	3	2	2
		 * 	4	3	1
		 */
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i-1;j++)//공백
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=5-i;k++)//별표
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//문제
		/*
		 *    *
		 *   ***
		 *  *****
		 * *******
		 * 
		 * 	i	j			==> i+j==> j=4-i
		 * 	줄수	공백	별표
		 * 	1	3	1			i*2-1 ==> j     // 짝수에서 홀수로 이동할때 2곱하고 1빼주기
		 * 	2	2	3
		 * 	3	1	5
		 * 	4	0	7
		 */
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4-i;j++)//공백
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i*2-1;k++)//별표
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	/*
	*	1. 형식
	*	2. 2차 for ==>
	*		for()
	*		{
	*			for(;조건문;)
	*				------
	*			{
	*			}
	*		}
	*	3. 변수위치, 증가식 
	*/
	}

}
