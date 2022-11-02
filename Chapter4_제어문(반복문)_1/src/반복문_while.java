/*
 * while ==> 167page
 * ------------------무한 루프(데이터베이스에서 많이 등장)
 * 1) 순차적으로 실행
 * 		초기값 1 
 * 		while(조건식) 2 조건이 true일때 반복 {}, false 종료
 * 		{
 * 			반복수행문장 3 
 * 			증가식 4
 * 		}           1    2    4
 * 		=====> for(초기값;조건식;증가식)
 * 				반복 수행문장  3
 * 		주의점)
 * 			for(;;) ==> while(true)
 * 			while() ==> 반드시 조건문을 제시
 * 				 -- 조건(비교, 논리, 부정), true/false
 * 		
 * 		int i=1;
 * 		while(i<=10)
 * 		{
 * 			i++; => 1~10
 * 		}
 * 		-----------------while종료 i = 11
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z,Z~A
		char c = 'A';
		while(c<='Z')
		{
			System.out.print(c+" "); // System.out.print((char)(c+32)+" ");-> 소문자 'A' => 65 'a' = 87
			c++;                     // char+int = ??????????
		}
		// 'Z'+1
		System.out.println();
		System.out.println("c="+c);
		//$c가 [인 상태에서 종료되었기 때문에 초기화를 시키지 않으면 [부터 -1을 한 값을 출력한다. $
		
		c='Z';
		while(c>='A')
		{
			System.out.print(c+" ");
			c--;
		}
		System.out.println();
		int i=1;
		while(i<=100)
		{
			i++;
		}
		System.out.println("i="+1);
	}

}
