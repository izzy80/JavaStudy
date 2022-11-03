// 사용자가 구구단을 요청 ==> 단을 넘겨준다(매개변수 => 단)
/*
 * 	자체 출력
 * 	값을 넘겨준다
 */
import java.util.Scanner;
public class 메소드_2 {
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	} // 더 잘짠 코드
	static String gugudan2(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			//System.out.println(dan+"*"+i+"="+dan*i);
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력:");
		int dan = scan.nextInt();
		gugudan(dan);
		System.out.println("================");
		String result=gugudan2(dan);
		System.out.println(result);
	}

}
