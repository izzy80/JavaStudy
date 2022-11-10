/*
 *	변수(인스턴스변수, 정적변수(클래스변수), 지역변수, 매개변수)
 *	1. 인스턴스변수, 클래스변수 => 기본 디폴트로 자동 초기화
 *		1) 자동 초기화 => 나중에 값을 변경
 *		2) 시작과 동시에 데이터값이 필요할때도 있다
 *			= 명시적인 초기화
 *				class A
 *				{
 *					int a=10; =========== 0
 *					String s="aaa"; ===== null
 *				}
 *				예) Movie[] movie = new Movie[1938]; ==> 초기화
 *					Movie[] movie={"","","","",""}
 *				= 생성자 
 *					class A ==> 변수의 초기화 메소드
 *					{
 *						Movie[] movie = new Movie[1938];
 *						A()
 *						{
 *							for()
 *							{
 *								movie[i]=값
 *							}
 *						}
 *					} 
 *				
 *					= 초기화 블록 : 자동 인식 ==> 구현해서 변수값을 구하는 경우
 *						** 구현 : 메소드 호출, 제어문, 연산처리, 파일 읽기 ...
 *						** 선언 : 변수 선언, 메소드 선언
 *								int a; int a = 10;
 *								abstract void aaa();
 *								void aaa()
 *								{
 *								
 *								}
 *						1. 인스턴스 블록 : 인스턴스 변수, static 변수에 대한 초기화
 *						2. static 블록 : static 변수에 대한 초기화
 *
 *						사용법
 *						class A
 *						{
 *							int a=10;
 *							a=100;  ==> 오류
 *
 *							{
 *								a = 100;
 *							} * 인스턴스 블록
 *						}
 *
 *						class A
 *						{
 *							static int a=100;
 *							a = 200; ==>
 *							static
 *							{
 *								a=200;
 *							} * static 블록
 *						}
 *					
 *	2. 지역변수 => 반드시 초기화후 사용
 *	3. 매개변수는 메소드가 호출될 때
 *
 */
public class 초기화블록_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
