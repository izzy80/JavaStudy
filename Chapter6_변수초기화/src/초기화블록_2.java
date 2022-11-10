class A
{
	int a=10;
	static int b=20;
	
	//instance
	{
		a=100;
	}
	
	//static
	static 
	{
		b=200;
	}
	
	// 생성자
	A() 
	{
		a=1000;
		b=2000;
	}
}
/*
 * 1. 명시적 초기화
 * 2. 명시적 초기화가 불가능
 * 		인스턴스 : 생성자 이용해서 초기화 (**********)
 * 		static : static{} => 가끔 MyBatis에 등장함
 */
public class 초기화블록_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		/*
		 * 	b
		 * ----	---- ---- ----
		 * 	0	20	200   2000
		 * ---- ---- ---- ----
		 * 	a
		 * ---- ---- ----- -----
		 * 	0	10	  100   1000
		 * ---- ---- ----- -----
		 * 
		 */
	}

}
