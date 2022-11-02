/*
 *	2*1=2 ----- 9*1 = 9
 *	-
 *	-
 *	-
 *	-
 *	2*9=18       9*9=81
 *
 *	줄수(i) ==> 9줄
 *	한줄에 출력한 갯수 ===> 8개
 *
 *	for(int i=1;i<=9;i++)
 *	{
 *		for(int j=2;j<=9;j++)
 *		{
 *			구구단
 *		}
 *		다음줄에 내린다
 *	}
 */
public class 반복문_중첩For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) // 2*1~2*9
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d *%2d=%2d\t",j,i,j*i);
			 }
			 System.out.println();
		}
	}

}
