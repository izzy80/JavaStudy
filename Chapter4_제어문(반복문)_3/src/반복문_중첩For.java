/*
 * 	1) 조건문 중첩
 * 		if(조건문) ==> 로그인
 * 		{
 * 			if(조건문) ==> Admin
 * 			{
 * 				===================> if(조건문 && 조건문) ==> Admin 메뉴
 * 			}
 * 			else ==> User
 * 			{
 * 				===========> User메뉴
 * 			}
 * 		else
 * 		{
 * 			Guest(로그인 안 된 상태) =======> 일반 메뉴
 * 		}
 * 
 * 		2) 선택문 중첩 ===> 게임, 네트워크
 * 			switch(변수) 
 * 			{
 * 				case 값:
 * 					switch(변수)
 * 					{
 * 						case 값:
 * 					}
 * 					break;
 * 			}
 * 		3) 반복문 중첩
 * 			===========> for
 * 			for()
 * 			{
 * 				for()
 * 				{
 * 				}
 * 			}
 * 			==========================> 가장 많이 쓰임. 이거 중심으로 공부하기. 
 * 			for()
 * 			{
 * 				while()
 * 				{	
 * 				}
 * 			}
 * 
 * 			while()
 * 			{
 * 				for()
 * 				{
 * 				}
 * 			}
 * 		
 * 			while()
 * 			{
 * 				while()
 * 				{
 * 				}
 * 			}
 * 			================================
 * 			이중 for문
 * 			- 변수의 위치가 중요!!
 * 			변수
 * 			for() =====> 줄수 : 내가 몇 줄 출력하고 싶은지 파악하면 금방 코딩가능
 * 			{
 * 				변수
 * 				for()
 * 				{
 * 					변수
 * 					실제 출력문
 * 				}
 * 				\n
 * 			}
 * 			모바일하다보면 3,4...차까지 하게 됨.
 * 			자바에서는 이중포문도 잘 안 나온다. 
 * 
 * 			A
 * 			AB
 * 			ABC
 * 			ABCD ==> 4
 * 			ABCDE
 * 			ABCDEF 
 * 
 * 			-------------
 * 			*
 * 			**
 * 			***
 * 			****
 * 
 *			**** 
 * 			***
 * 			**
 * 			*
 * 				 *
 * 				***
 * 			   *****
 * 			  *******
 * 
 * 		==============> 변수위치
 * 		
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 		*****
 * 
 * 		형식)            | false ==> for종료
 * 				1		2	7
 * 			for(초기값;조건식;증감식)
 * 			{
 * 							|true
 * 				--------------------------
 * 							| false ==> 1차 for의 증가식
 * 					3 ->   4  <- 6
 * 				for(초기값;조건식;증감식)
 * 				{	
 * 						| true ↗
 * 					실행문장 5
 * 				}
 * 				--------------------------
 * 			}
 * 			 => for(int i=1;i<=3;i++)
 * 				{
 * 					for(int j=1;j<=3;j++)
 * 					{
 * 					}
 * 				} 
 * 
 * 				i = 1 => j = 1,2,3
 * 				i = 2 ==> j = 1,2,3
 * 				i = 3 ==> j = 1,2,3
 * 				i가 false종료
 * 				j가 false라고 종료되는 것이 아님.j가 false면 i로 올라감. 
 */
public class 반복문_중첩For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		
		//1차 for
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("☆");
		System.out.println();
	
		System.out.println("2차 For문 이용");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				System.out.print("★");
			System.out.println();	
		}
		
		
		
	}

}
