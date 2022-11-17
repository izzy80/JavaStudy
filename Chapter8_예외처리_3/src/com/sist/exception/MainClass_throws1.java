package com.sist.exception;
/*
 * 	throws
 * 	------
 * 		이미 만들어진 메소드에서 예외에 대한 예측이 어렵다
 * 		==> 다른 언어 예외 선언X ==> 코딩과 동시에 에러처리를 할 수 없다. 
 * 		==> 자바에는 어떤 에러가 발생할지를 선언을 하고 있다 (대비) => 견고한 프로그램을 만들 수 있다.  
 * 			# 선언되어 있으면 이것에 대해서 주의깊게 코딩을 한다. 미리 선언을 하면 대비하기 편하다
 * 		==> 가독성
 * 		----------------------------------------------------------------------
 * 		aaa() : 기능, 리턴형
 * 		#받았을 때 문제가 있음. 어떤 에러가 발생할 지 알아야 조건문을 쓰던지 그런다. 배포할 때 에러나면 큰일 남. 
 * 		
 * 		--------------------------------------------------------------------------
 * 		void aaa(char a, int a, int b)
 * 		void aaa(int a, int b, int c)
 * 
 * 		aaa('A','A',10) // 오버라이딩 하고 호출함. 어떤 것이 호출될까?
 * 
 * 		throws => 생성자, 메소드에서만 사용이 가능
 * 				초기화블록에서는 throws를 사용 할 수 없다 
 * 
 * 
 */
public class MainClass_throws1 {
	/*// 1
	static void aaa(char c, int a, int b)
	{
		System.out.println("1");
	}
	static void aaa(int a, int b, int c)
	{
		System.out.println("2");
	}*/
	/*//2
	static void aaa(short c, short a, short b)
	{
		System.out.println("1");
	}
	static void aaa(int a, int b, int c)
	{
		System.out.println("2");
	}*/
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) /*1. throws Exception(선언)*/{
		// TODO Auto-generated method stub
		/*// 1
		aaa('A', 'B',10); //1
		aaa(10, 'B','A'); //2*/
		/*//2
		aaa(10, 20,30); //2*/
		//-----------------------------------------
		/*method1(); // 예외처리하고 써라라고 했는데 처리를 안 해서 오류남 
		 * try
		 * {
		 * method1();
		 * }catch(Exception ex) {}
		 *  //try-catch(직접 처리하고 들어가냐)
		 */
		
	}

}
