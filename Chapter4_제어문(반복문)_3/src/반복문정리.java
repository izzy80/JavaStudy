/*										
 * 자바 / 오라클 / JSP / Spring / JavaScript(Ajax, Vue, React)
 * 											- java script 약자
 * ---------------------------------------- AWS
 * HTML5/CSS -> 짧게 배움
 * 오라클 <==> 자바(JDBC=MyBatis, JPA) => JSTL/ThymeLeaf(VueJS) 연동하는 프로그램이 핵심 
 * 											v-for, th:each
 * 											v-if, 	th:if ======>
 * 자바 / 오라클 / JSP /Spring/JavaScript(Ajax,HTML5/CSS,AWS) => 교재 있음. 
 * -------------------------------------------------------------------------
 * page 156~157
 * 	=> 반복 횟수를 알고 있는 상태(화면 UI)
 * 	=>형식
 * 		= 초기값 ==> 1,0,100,1000...
 * 		= 조건식
 * 			범위 지정 => 횟수
 * 		= 증감식(++,--) => 쿠키에 저장
 * 			여러개 ==> 복합 대입연산자 사용 +=, -=
 * 		for(초기값;조건문;증가식)
 * 		{
 * 			출력 내용
 * 		}			false ==> 종료 
 * 		초기값 ==> 조건문 ===> 출력 내용 ==> 증가식
 * 					↑			true		↓
 * 					=========================
 * 		for(;;)
 * page 167~168 (while)
 * 		=> 데이터베이스 , 횟수를 모르는 상태
 * 		=> 조건문을 생략할 수 없다.
 * 		초기값
 * 		while(조건식) ==> 무한루프
 * 		{
 * 			반복수행문장
 * 			증가식
 * 		} 
 * 	
 * 		-----------------------------
 * 		while(true) ==> 처음으로 돌아간다. 
 * 		{
 * 			반복수행문장
 * 			if()
 * 			{
 * 				종료 조건//반드시 주어야함.
 * 			}
 * 		}
 * page 175 (break) ==> switch~case, 반복문에서만 사용이 가능, break가 있는 반복문만 제어가 가능
 * 					==> 반복문을 종료(for, while)
 * 
 * page 176 (continue) ==> 반복문에서만 사용이 가능, continue가 있는 반복문만 제어가 가능
 * 						=> 특정부분을 제외할때, 처음으로 시작할때
 * 						=> for => 증가식으로 이동, while, do~while ==> 조건식으로 이동
 * ----------------------------
 * 
 */
public class 반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "Hello Java";
//		System.out.println(msg);
//		for(int i=msg.length()-1;i>=0;i--)
//		{
//			System.out.println(msg.charAt(i));
//		}
		int a=10;
		if(a==10)
		{
			//break;
			
			
		}//사용불가
		for(;;)
		{
			if(a==10)
				break;
		}
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;//break는 바로 앞에 있는 for문만 제어. 그 앞에 있는 for문은 제어하지 못함. 
			}
		}
		// i=1,j=1,i=2,j=1
	}

}
