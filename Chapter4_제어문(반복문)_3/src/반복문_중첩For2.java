/*
 * AAAAA
 * -------- 5
 * BBBBB
 * CCCCC
 * DDDDD
 * EEEEE
 * ---------> 1~5
 * @
 * for(int i=1;i<=5;i++)
 * {	@
 * 		for(int j=1;j<=5;j++)
 * 		{
 * 			@	
 * 		}
 * 		System.out.println();
 * }
 */
public class 반복문_중첩For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		/*
		 * AAAAA
			BBBBB
			CCCCC
			DDDDD
			EEEEE
		 */
		
		c = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		/*
		 * ABCDE
			FGHIJ
			KLMNO
			PQRST
			UVWXY
		 */
	}

}
