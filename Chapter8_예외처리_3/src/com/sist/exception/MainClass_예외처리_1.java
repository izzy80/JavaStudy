package com.sist.exception;
/*
 * 1. try~catch
 * 2. throws
 * 	  ---------
 * 		예외선언(예외회피) => 시스템에 예외 알려준다
 * 		형식)
 * 			public void display() throws NumberFormatException, RuntimeException, Exception
 * 										----------------------------------------------------
 * 											catch : 순서O, throws : 순서X
 * 			=> 라이브러리는 예상된 예외를 throws로 이용해서 등록
 * 				==> 			  ----------------- 처리하면서 사용을 해야 된다
 * 					사용법 2가지가 있다
 * 					1) try~catch : 직접 처리하는 방법
 * 					2) throws : 선언만 처리
 * 
 * 					public void display() throws Exception => display()를 호출시에는 Exception 처리한 후 사용
 * 					{
 * 					}
 * 
 * 					public void aaa()
 * 					{
 * 						display(); // 오류코드
 * 					}
 * 
 * 					1) 
 * 						public void aaa()
 * 						{
 * 							try
 * 							{
 * 								display();
 * 							}catch(Exception e){}
 * 						}
 * 					2)
 * 						public void aaa() throws Exception
 * 						{
 * 							display();
 * 						}
 * 					-------------------------------------------------
 * 					public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundException
 * 					// aaa()메소드를 쓸려면 throws뒤의 에러를 처리한 후 사용해라 	
 * 					{
 * 					}
 * 			
 * 					main()
 * 					{
 * 						aaa(); //정상 수행
 * 					}
 * 
 * 					// Exception / Throwable
 * 						모든 예외를 처리할 수 있는 클래스
 * 	
 * 						void aaa() throws IOException , ClassNotFoundException
 * 		
 * 						void bbb() throws IOException , ClassNotFoundException			
 * 						void bbb() throws Exception ==> 확대
 * 						void bbb() throws Throwable ==> 확대
 * 
 * 						void aaa() throws Throwable ==> 축소
 * 	
 * 						void bbb() throws Exception(X)
 * 
 * 							Throwable => 상위클래스
 * 								|
 * 						-----------------
 * 						|				|
 * 					Error			Exception
 * 									RuntimeException => 예외처리를 생략할 수 있다 
 * 										|
 * 									NumberFormatException, NullPointerException
 *
 *  public void aaa() throws 예외처리의 종류, 예외처리의 종류, 예외처리의 종류
 *  						------------------------------------
 *  						순서가 없다
 *  => 예외 선언 ==> 호출시에 예외가 예상된다 => 예외처리를 한 다음에 사용을 해라 
 *  => 선언 / 처리 가능
 *     -- 예외 떠넘기기 => 다음에 메소드 호출 시에 처리 후 사용해라
 *     직접처리 : 복구
 *     ------------ 
 *  => 예외처리를 받는 경우 ==> 선언된 예외를 다 받을 수 있다 
 *  				  ==> 묶어서 받을 수 있다 
 *  				  ==> 축소는 할 수 없다 
 *  				  ==> Throwable, Exception 
 *  method() throws Exception 
 *  try
 *  {
 *  }catch(Exception e){}
 *  
 *  예외처리의 목적 : 종료하지 않는 프로그램 제작
 *  		정의 : 에러에 대한 사전 대비하는 프로그램을 만드는 것
 *  ==> 에러코드를 건너뛰어서 다음 문장이 실행되도록
 */
public class MainClass_예외처리_1 {
	// CheckException => 컴파일러 예외처리가 되었는지 확인 => 반드시 예외처리해서 사용한다
	public static void aaa() throws Exception 
	{
		
	}
	//UnCheckException => 컴파일러 예외처리를 확인하지 않는다 => 예외처리를 생략할 수 있다
	public static void bbb() throws NumberFormatException, NullPointerException 
	{
		
	}
	
	public static void main(String[] args) throws Exception {
		//									--------------- 2번째 방법: 단 RuntimeExeption 같은 작은 것을 가져다 놓으면 안 된다. 위에 이미 Exception을 썼기 때문에					
		//													그런데 이렇게 잘 안씀. 에러 확인이 잘 안 되기 때문에 try-catch절을 많이 사용함. 
		//													간접 ==> 자바시스템에서 처리 요청
		// TODO Auto-generated method stub
		/*// 1번째 방법
		bbb(); // 에러 없다.
		// aaa(); // 에러 있다. 
		try
		{
			aaa(); 
		}catch(Exception ex) {}*/
		//aaa();
		Thread.sleep(1000); // 프로그래머가 직접 처리해서 사용
		
	}

}
