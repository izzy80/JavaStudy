import java.awt.print.Printable;
import java.util.Scanner;


public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
//			x >= 10 && x < 20

		//문제2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

//			ch==' ' && ch != '\t'

		//문제3) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
//			ch == 'x' || ch =='X'
//		{
//			
//		}
		//문제4) char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
//		if (ch >= '0' && ch <= '9')
//		{
//			
//		}
		// 문제5) 이중for문이라 제외
		// 문제6) 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력 (시작, 끝):");
//		int start = scan.nextInt();
//		int end = scan.nextInt();
//		int multi = 1; // 곱하기라서 0이 아니라 1. 0으로 하면 답이 0으로 나옴. 
//		
//		for(int i = start; i<=end;i++)
//		{
//			multi*=i;
//		}
//		System.out.println("multi:"+multi);
//		
//		int start = 0; end = 0;
//		omt gop = 1;
//			
//		while(true)
//		{
//			System.out.println("시작 입력:");
//			start = scan.nextInt();
//			System.out.println("끝 입력:");
//			end = scan.nextInt();
//			if(start<end) // start가 end보다 작아야만 함. ==> 오류처리
//				break; // 종료
//				
//		}
		// ===================while문============================== 
		
		// 문제 7) 5~16까지의 합을 구하시오
//		int sum = 0;
		// 시작점; 끝나는 점; 몇 개 증가(i++, i+=2,i+=3......)
//		for(int i=5;i<=16;i++)
//		{
//			sum += i;
//		}
//		System.out.println("5~16까지의 합:"+sum);
		// ===================while문============================== 
		
		//문제 8) 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
//		int sum = 0;
//		for(int i=3;i<=4462;i+=2)
//		{
//			sum+=i;
//		}
//		System.out.println("3이상 4462 이하에서 짝수인 정수의 합:"+sum);
		//강사님 풀이
//		int sum=0;
//		for(int i=3;i<=4462;i++)
//		{
//			if(i%2==0) //짝수
//				sum+=i; //값을 누적
//		}
//		System.out.println("sum="+sum);
		// ===================while문============================== 
		
		//문제 9) 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
//		int sum1 = 0,sum2 = 0;
//		for(int i=0;i<=12;i++)
//		{
//			if(i%2==0)
//			{
//				sum1 += i;
//			}
//			if(i%3==0)
//			{
//				sum2 += i;
//			}
//		}
//		System.out.println(sum1+sum2);
		// ===================while문============================== 
		
		//문제 10) 1~100까지의 정수 중 4의 배수의 합계를 구하라
//		int sum = 0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%4==0)
//			{
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		// ===================while문============================== 
		
		// 문제 11)10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성 
		// 변수 10개?????변수 1개???? 어떻게 설정할지 생각해야함. 
//		int count = 0;
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("정수 입력:");
//			int num = scan.nextInt();
//			
//			if(num%2==0)
//			{	
//				count += 1;	
//			}
//		}
//		System.out.println("count="+count);
		// ===================while문============================== 
		
		// 문제 12)10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
//		int count3 = 0,count5 = 0;
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("정수 입력:");
//			int num = scan.nextInt();
//			
//			if(num%3==0)
//			{	
//				count3 += 1;	
//			}
//			if(num%5==0)
//			{	
//				count5 += 1;	
//			}
//		}
//		System.out.println(count3+count5);
		//강사쌤 답 : random 이용
//		int count3 = 0,count5 = 0;
//		
//		for(int i=0;i<=10;i++)
//		{
//			int num = (int)(Math.random()*100)+1;
//			System.out.println("num="+num);
//			
//			if(num%3==0)
//				count3++;	
//			
//			if(num%5==0)
//				count5++;	
//		}
//		System.out.println("count3="+count3);
//		System.out.println("count5="+count5);
		// ===================while문============================== 
		




		   



	}

}
