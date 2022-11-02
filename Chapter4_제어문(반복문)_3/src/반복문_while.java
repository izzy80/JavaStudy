/*
 * 
 */
import java.util.Scanner;
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력(56789)>>");
		//만원, 천, 백, 십, 단
		int won=scan.nextInt();
		int a = won/10000;
		int b=(won%10000)/1000;
		int c = (won%1000)/100;
		int d = (won%100)/10;
		int e = won%10;
		
		System.out.println("만원권:"+a);
		System.out.println("천원권:"+b);
		System.out.println("백원:"+c);
		System.out.println("십원:"+d);
		System.out.println("일원:"+e);
		
		
		
		
	}

}
