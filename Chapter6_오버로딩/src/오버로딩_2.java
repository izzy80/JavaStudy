/*
 *  add(int a, int b)
 *  add(double d1, double d2)
 *  add(float f1, float f2)
 *  add(char c1, char c2)
 *  add(String s1, String s2)
 *  add(double d, int i)
 *  add(float f, char c)
 *  ...
 *  ...
 *  => 위에 있는 많은 메소드를 한 번에 줄이는 코드 : add(Object o1, Object o2) 
 *  
 *  // 다른 데이터형이 여러개 ==> Object 
 *  // 갯수가 여러개 ==> ... (가변인자)
 *  
 */
public class 오버로딩_2 {
	/*void names(String n1)
	{
		System.out.println(n1);
	}
	void names(String n1, String n2)
	{
		System.out.println(n1+" "+n2);
	}
	void names(String n1, String n2, String n3)
	{
		System.out.println(n1+" "+n2+" "+n3);
	}
	void names(String n1, String n2, String n3, String n4)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4);
	}
	void names(String n1, String n2, String n3, String n4, String n5)
	{
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
	}*/
	
	
	//가변 매개변수
	// 위에 있는 5개 메소드 대신 사용
	//System.out.printf("%d",10);
	//System.out.printf("%d%d%d",10,20,30); //printf와 비슷한 형식
	//PrintStram java.io.PrintStream.printf(String format, Object..a. args)
	
	void names(String...name) // String을 내가 원하는만큼 집어넣어라. 
							 // ...은 연산자. 웹에서 사용자가 보내준 데이터를 받는 경우일때 많이 사용
	{
		for(String s:name)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_2 a = new 오버로딩_2();
		a.names("홍길동");
		a.names("홍길동", "박문수");
		a.names("홍길동", "박문수","이순신");
		a.names("홍길동", "박문수","이순신","김두한");
		a.names("홍길동", "박문수","이순신","김두한","강감찬");
		

	}

}
