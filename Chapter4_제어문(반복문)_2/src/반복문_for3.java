/*
 * 1~10 ==> 홀수만 출력 ==> 1 3 5 7 9 => if문 사용하지 말고!
 * 		==> 짝수만 출력 ==> 2 4 6 8 10 
 * 1 4 7 10 (i+=3)
 */
public class 반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int i= 1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		for(int d=2;d<=10;d+=2)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		int d= 2;
		while(d<=10)
		{
			System.out.print(d+" ");
			d+=2;
		}
	}

}
