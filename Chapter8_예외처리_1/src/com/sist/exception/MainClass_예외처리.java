package com.sist.exception;
/*
 * 오작동 / 비정상 종료 ==> 에러
 * --------------
 * 33대란 : 신한 / 농협 해킹 당함(북한 소행이라는 뉴스)
 * 			-------- 소프트포럼이 보안 담당 (보안업체:김랩/안랩)
 * 					---------------- 신입이 소스 수정하는 과정에서 1000 -> "10,00"으로함.
 * 									 소스상에 문제가 없음. 문자열은 에러를 직접 보야아함.  
 * 에러
 * ----
 * 		1) 수정이 불가능 에러
 * 		2) 수정이 가능한 에러 =================> 예외처리
 * 			-----------
 * 			에러 => 사용자가 입력이 잘못하거나(유효성 검사) 
 * 					계산기 ==> 0으로 나누다 => error
 * 
 * 					프로그래머 실수 (유효성 검사를 할 수 없음)
 * 					배열, 캐스트, NULL
 * 	
 * 					int[] arr = new int[2];
 * 					arr[2] = 100; => 오류 : 범위 벗어나서 오류
 * 					------------------------------
 * 					String s;
 * 					s.trim(); => 오류 : 주소값이 없음.
 * 
 * 					==> 복구 / 회피 : throws
 * 						---
 * 						try~catch
 * 		----------------------------------------------------------
 * 			***컴파일에러 : 컴파일시에 에러(문법에러) javac
 * 			***런타임에러	: 실행시에 에러 java
 * 			논리적에러 : 실행은 된다. 프로그램 제작과 다르게 동작
 * 		-----------------------------------------------------------
 * 			견고한 프로그램 : 에러가 발생시 종료하지 않고 정상 수행이 가능하게 만드는 것
 * 			1) 에러를 사전에 방지하는 프로그램을 고민
 * 			   -------------
 * 				 if => 고려
 * 						if문으로 처리가 어려운 부분 => 예외처리
 * 			2) 예외처리 : 가벼운 에러, 수정이 가능한 에러
 * 						----------------------
 * 				웹 :404, 500, 415, 400 => 처리가 가능
 * 					-----------------
 * 					404 => 파일이 없는 경우(웹 => 서버에 파일을 보여 달라) => 파일명(파일명을 변경)
 * 					500 => 문법에러
 * 					415 => 한글변환 (UTF-8) => UFT-8로 잘 못 씀
 *					400 => 전송 데이터 ==> 받는 데이터의 데이터형이 다른 경우
 *							"홍길동" ==> int 
 *					--------------------------------------------------------------------
 *					자바 => Exception : NullPointException, ArrayIndexOutOfBoundsException
 *							==> output창 
 *			3) 예외처리의 종류
 *				***= 예외 복구 : 예외가 발생하면 복구해서 다시 수행이 가능 *****
 *					try{
 *							정상 수행문장
 *							=> 에러발생할 수 있다
 *						}catch()
 *						{
 *							에러가 발생시 복구
 *						}
 *
 *				***= 예외 회피 : 에러부분을 제외하고 다음문장으로 수행
 *					method() throws 예외처리종류....
 *				= 예외 임의 발생 : 테스팅시 예외를 발생해서 견고한 프로그램인지 확인
 *					throw 예외처리;
 *				= 사용자 정의 예외처리 : 자바에서 지원하지 않는 경우에 직접 제작
 *					class A extends Exception 
 *			4) 예외처리의 정의, 목적
 *				정의 : 프로그램 실행시 발생할 수 있는 에러에 대비한 코드를 작성한다
 *											------------- 사전 방지
 *					 회원가입 : * 필수입력 (값이 없는 경우(null) 오라클에서 에러발생) => NOT NULL
 *				목적 : 프로그램의 비정상종료를 방지하고 정상 상태를 유지
 *			5) 자바에서 지원하는 예외처리의 계층구조 (잘 기억하기)
 *				Error : 메모리가 부족, 윈도우 작동을 안 함. 이클립스문제 발생
 *				Exception : 파일명이 틀리다, IP가 틀리다, 웹사이트주소가 틀리다..., SQL문장을 잘못 수행
 *							Object 
 *							   |
 *							Throwable : 에러처리하는 최상위 클래스
 *							   |
 *					---------------------------------
 *					|								|
 *					Error(수정이 불가능)			Exception(수정이 가능한 에러) # Exception 하나쓰면 아래의 양사이드 에러를 다 잡아줌
 *													|
 *												----------------------------------------
 *					 							|								 		|
 *											IOException(파일)							RuntimeException (실행시 에러)
 *											SQLException(데이터베이스)						| -------------------------------------------> 약간 상속 느낌쓰..
 *											MalformedURLException(URL, 서버)			ArrayIndexOutOfBoundsException
 *											ClassNotFoundException(리플렉션)			NumberFormatException
 *											InterruptedException(쓰레드)				NullPointerException
 *																					ClassCastException
 *																					ArithmeticException
 *											----------------------------------		----------------------------------					
 * 											CheckException							UnCheckException
 * 												  |										|
 * 												컴파일시에								예외처리여부를 확인하지 않는다
 * 												예외처리여부를 확인						필요시에 예외처리
 * 										크롤링 / 파일(IO)
 * 										--- URL
 * 			
 * 										*** 상속을 내리는 클래스가 => 더 많은 에러를 잡을 수 있다. 
 * 			6) 예외처리 형식
 * 			   ---------
 * 				***1. 직접 처리(예외 복구) => 프로그래머 직접 처리를 한다(오늘 배우는 부분)
 * 				2. 간첩 처리(예외 회피 = 예외 떠넘기기) => 자바시스템에 맡긴다
 * 				3. 예외 임의 발생(사용자가 예외처리)
 * 				4. 사용자 정의 예외처리	
 * 
 * =================================================================================================================
 * 				1. 직접처리(예외 복구) : 웹, 데이터베이스는 CheckException (무조건 예외처리를 해야 된다)
 * 					1) 변수 , 2) 메소드, 3) 예외처리, 4) SQL
 * 					-----------------------------------
 * 				2. 형식
 * 					try
 * 					{
 * 						정상수행이 가능한 소스
 * 						= 지금까지 코딩한 부분
 * 					}catch(예외처리 종류)
 * 					{
 * 						에러발생 처리하는 영역 => 실질적으로 지금은 에러 확인 ==> 예상되는 예외처리 ==> catch(여러번 사용이 가능)
 * 					}
 * 					finally
 * 					{
 * 						try, catch 수행 상관없이 무조건 수행하는 문장 ==> 생략이 가능
 * 						에러발생, 정상 수행 상관없이 무조건 수행하는 문장이 존재
 * 						----------------------------------------
 * 						1) 파일 닫기
 * 						2) 오라클 닫기 => 라이센스가 없어서 test(XE)버전 사용. 동시에 50명 접근하면 무너짐. 에러가 나도 정상수행을 해도 닫아야함
 * 						3) 서버 닫기						
 * 					}
 * 					*** 예외처리
 * 					1. 고민 : 예상되는 에러
 * 					예) 
 * 						두개의 정수를 문자열을 받아서 정수배열에 저장. 저장된 데이터를 나누기를 하는 프로그램 제작
 * 						예상되는 에러는? 1. 배열 인덱스 : ArrayIndexOutOfBoundsException
 * 									2. 문자열 => 정수 변경하는 과정 : NumberFormatException
 * 									3. 나누기(0) : ArithmeticException
 * 						예외처리는 생각한 갯수 + 1(기타)로 해주어야함. (생각지도 못 했던 에러가 튀어나올수도 있어서)
 * 											---- 모든 에러를 잡을 수 있는 것으로 처리
 * 					*** 신입일때는 catch에러를 생각해서 잘 사용하기!!!!
 * 
 * 					2. 고민 : 예외처리의 위치
 * 						
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr = new int[2];
		arr[2]=100; //ArrayIndexOutOfBoundsException 오류*/
		//------------------------------------------------------------------
		/*try
		{
			
		}
		catch(ArithmeticException ex) {}
		catch(ArrayIndexOutOfBoundsException ex) {}
		catch(RuntimeException ex) {}*/
		//------------------------------------------------------------------
		/*try
		{
			for(int i=1;i<=10;i++)
			{
				int r = (int)(Math.random()*3); // 0,1,2
				if(r==0)// 0이면 오류가 나서 조건문 걸어줌
				{
					i--;
					continue;
				}
				System.out.println(i+"-"+(i/r));
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); //에러 확인 : 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 출력
		}*/
		//위에 코드보다 아래 코드로 사용한다. 
		// try~catch는 전체 소스를 사용 ==> 부분적으로 사용이 가능
		for(int i=1;i<=10;i++)
		{
			try
			{
				int r = (int)(Math.random()*3);
				System.out.println(i+"-"+(i/r));
			}catch(Exception ex)
			{
				i--;
			}
			// 밖에 있느냐 안에 있느냐에 따라 수행하는 내용이 달라질 수 있다. 
		}
		/*
		 * -----------
		 * ----------
		 * ----------------
		 * try{
		 * ----------에러
		 * ---------에러
		 * }catch(){}
		 * -----------
		 */
		

	}

}
