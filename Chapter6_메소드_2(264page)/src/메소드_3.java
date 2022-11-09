
public class 메소드_3 {
	// 100 ==> 99 instance, 1 static
	static void aaa()
	{
		//fisrt(); static에서는 static은 호출 가능, instance 사용 불가
		메소드_3 m=new 메소드_3();
		m.first();
		// 위 방법을 통해서 static에서 인스턴스 변수, 메소드 호출 가능.
		// 반드시 메모리 할당을 한 후에 사용한다. 
		// page 278_3번
	}
	
	void first() // instance에서는 instance와 static호출 가능
	{
		aaa(); 
		System.out.println("first() 진입..."); //1
		second();
		System.out.println("first() 종료..."); //6
	}
	void second()
	{
		aaa();
		System.out.println("secon() 진입...."); //2
		last();
		System.out.println("second() 종료..."); //5
	}
	void last()
	{
		System.out.println("last() 진입...."); //3
		System.out.println("last() 종료..."); //4
	}
	/*
	 * 		last
	 * 		------
	 * 		second		second
	 * 		-----		-----
	 *		first 		first		first	
	 * 		----		----		----		-----
	 * 		main		main 		main		main		==>	--------
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드가 메모리에 저장이 안 됨
		System.out.println("main() 진입...");
		메소드_3 m = new 메소드_3(); // 메소드가 m이라는 공간에 저장되는 시점
		System.out.println("메모리 제작 m="+m);
		System.out.println(m+"메모리 주소에 메소드가 전체 저장");
		m.first();
		System.out.println("main() 종료..."); //7
		
	}

}
