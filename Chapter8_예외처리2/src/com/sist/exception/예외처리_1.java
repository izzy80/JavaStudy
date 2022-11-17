 /* 
  * 들어가기전에
  * 변수(데이터형)
 * int, double, boolean,String 
 * 연산자 : 증감연산자, 형변환, 산술, 비교, 논리, 대입, 삼항
 * 제어문 ㅣ if, for, while, break
 * ---------------------------------------------
 * 배열 1차원 : String[]
 * ----------------------------------------------
 * 클래스 : 멤버변수, 생성자, 메소드
 * 		=> 캡슐화, 오버라이딩, 포함 클래스 
 * 인터페이스
 * 예외처리(throws, try-catch)
 * ----------------------------------------------라이브러리
 * String / StringBuffer/Wrapper/Date/Calendar/List(배열) / Map / Set / IO
 * ------------------------------------------------------------------------
 * SQL(데이터베이스 연동)
 * 
 * 
 * 브라우저에서 실행할 수 있는 언어가 HTML/CSS, JavaScipt만 실행됨.
 * 오라클 안에 데이터를 영구적으로 저장한다. 
 * 자바를 공부한 이유는 브라우저(컴퓨터)랑 오라클을 연결하는 것이 좋은데 이것이 안 된다. 이 기능이 없다. 할 수 있는 방법은 연결하는 방법을 찾는 것. 
 * 중간에 받아서 오라클로 넘겨서 데이터를 받아서 다시 브라우저에 보내주는 이 역할을 수행하는 것이 자바이다.  
 * 데이터를 가져와서 브라우저에 뿌리는. 이 프로그램을 짤 줄 알아야함. 
 * 
 * html보다 속도가 빨라서 react-vue를 최근에 많이 사용함. 
 * 웅답받은 것을 화면으로 출력만 해주는 역할 html
 * 응답하고 요청을 받기 위해서 java를 배움
 * 화면 출력 -> front
 * 응답 및 요청 => back
 */
package com.sist.exception;
/*
 *  컴파일(이진파일변경), 			인터프리터(한줄씩 읽기서 출력)
 *  --------------				---------------------
 *  	javac								java
 *  	  |					  				|
 *  	프로그래머							사용자의 오류
 *  --------------				----------------------
 *  CheckExecption					UnCheckException
 *  컴파일러가 예외처리가 되었는지 여부를 확인 	확인하지 않는다 => 예외처리 생략이 가능
 *  
 *  CheckException
 *  	= IOException : 파일명, 경로명
 *  	= ClassNotFoundException : 클래스가 없는 경우 (리플렉션 = new 없이 메모리 할당)
 *  	= SQLException : 데이터베이스 연결(오라클, MySQL)
 *  	= InterruptedException : 쓰레드 충돌 
 *  		# 메모장, 그림판(=>스레드) 동시에 사용가능하게 만듦. 충돌되면 윈도우 자체가 깨져버림. 
 *  	= MalformedURLException : IP, URL주소가 틀린경우 ==> 크롤링하면 많이 등장
 *  
 *  UnCheckException
 *  	= ArrayIndexOutOfBoundsException : 배열범위가 초과시에 (인덱스번호 오류)
 *  								=> 12장(컬렉션)
 *  	= NumberFormatException : 정수변환 ==> 웹 / 윈도우는 정수를 전송할 수 없다(내가 10을 보내도 문자열로 들어감)
 *  	= NullPointerException : 객체 생성없이 선언후 사용
 *  		모든 클래스는 기본값이 null => 메소드나 변수 사용이 안 됨
 *  	= ClassCastException : 클래스 형변환 ==> 제네릭스 (자동 형변환)
 *  		class A<T> ==> T는 임시클래스라서 디폴트가 Object ==> 12장 (데이터베이스의 기본)
 *  		{
 *  			T t;
 *  			public void setT(T t)
 *  			{
 *  			}
 *  			public T getT()
 *  			{
 *  			}
 *  		}
 *  		
 *  		A<String>
 *  
 *  
 *  
 *  
 *  
 */

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
