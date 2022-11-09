/*
 * 252page
 * ** 메소드
 * 		1) 인스턴스 메소드 : 인스턴스 변수를 이용할 때
 * 		2) 정적 메소드, 공유 메소드(static) : 인스턴스변수를 이용하지 않는 경우에 주로 사용
 * 		예) 
 * 			String s = "Hello Java!!";
 * 			s.substring()
 * 			- 
 * 			객체명
 * 			String.valueOf(10) // Hello java 이용하지 않음. 정적 메소드 사용. 
 * 
 * 		class Member
 * 		{
 * 			String id, pwd; // Heap
 * 			boolean isLogin(String id, String pwd) //Stack
 * 			{
 * 				this.id id
 * 				----
 * 				멤버 변수(클래스 안에 있는)
 * 				지역 변수는 그냥 쓴다. 
 * 			}
 * 			구구단을 출력
 * 			static void gugudan()
 * 			{
 * 			}
 * 			class를 활용하지 않으면 static 변수
 * 		}
 * 
 * 		*** static : 공유
 * 		*** instance : 개인
 * 		==========================> 메소드도 static, instance가 있다. 
 * 	1. 메소드 선언
 * 		1) 인스턴스 
 * 			리턴형 메소드명(매개변수...)
 * 			{
 * 				return 값; ==> return 생략이 가능(결과값이 없는 경우).이 때, void 사용함.
 * 			}
 * 		2) 정적(static)
 * 			static 리턴형 메소드명(매개변수...)
 * 			{
 * 				return 값;
 * 			}
 * 	2. 메소드 호출 방식 =================> 메소드는 메모리에 저장을 해서 사용해야 함. 
 * 		1) 인스턴스 : new를 이용해야 메소드가 저장된다. new 이용하지 않으면 저장공간이 없어서 사용할 수 없음
 * 			A a=new A();
 * 				--- a가 메모리 주소의 별칭 => a라는 공간에 메소드, 변수
 * 			예)
 * 				class A
 * 				{
 * 					int a;
 * 					String name;
 * 
 * 					void insert(int age, String name)
 * 					{
 * 					}
 * 					void update(int age, String name)
 * 					{
 * 					}
 * 					void list()
 * 					{
 * 					}
 *					//추가 수정 목록 가능하게 만듦
 * 				}
 * 	
 * 				A a = new A();
 * 					a라는 공간을 보게 되면 => ------------------
 * 												age
 *  									------------------
 *  											name
 *  									-------------------
 * 												insert()
 * 										--------------------
 * 												update()
 * 										--------------------
 * 												list()
 * 										--------------------- => 공간 안에 변수뿐만 아니라 메소드도 저장함. 
 * 																		
 * 								a.age, a.insert(), a.update(), a.list()
 * 								---------------------------------------  인스턴스변수, 인스턴스메소드
 * 																		a가 인스턴스이기 때문에
 * 				
 * 		2) 정적 (static) : 컴파일러에 의해서 메모리가 자동으로 저장이 된다. 
 * 				class A
 * 				{
 * 					static int a;
 * 					static void list(){}
 * 					---------------------- static 사용으로 저장이 된 상태.메모리 공간에 저장한 것이 아니라 별도로 따로 저장된 상태
 * 				}
 * 				클래스명.a , 클래스명.list()
 * 				----------------------- 클래스변수, 클래스메소드
 * 										클래스이름을 통해 접근하고 있음
 * 
 * 				라이브러리 공부할때 클래스명.메소드()면 static
 * 							  예) Math. random(), String.ValueOf()
 * 	3. 리턴형 / 매개변수
 * 	   ----   ----- 사용자가 이용해야하기 때문에 사용자가 클릭, 선택, 입력한 것 : 주소창을 본다. (웹에서는 주소창을 통해 값이 넘어감)
 * 		|			예) 주소라인에서 파일명?
 * 		|				https://movie.naver.com/movie/bi/mi/basic.naver?code=191657
 * 		|				코드받아서 영화정보 받음. ? 뒤에 값을 넘겨줌
 * 		|
 * 		화면에 무엇을 출력할지만 알면 된다. 화면 출력할 내용을 보면 return형이 뭔지 알 수 있다. 
 * 
 * 		리턴형 : 기본형(int, double..),  배열, 클래스
 * 
 * 		매개변수 : 기본형(int, double..), 배열, 클래스(String은 예외)
 *				-------------------	 ---------
 * 				Call By Value(실제 값)	Call By Reference(주소를 넘겨준다=> 데이터를 바꾸면 같이 바뀜)
 * ###
 * 		관련없으면 static
 * 		static 문제점 : 공유한다. 한 명이 바뀌면 데이터가 다 바뀜
 * 		instance는 안 바뀐다. 
 * 		사이트는 static을 많이 쓴다. 한 번 바뀌면 모든 사람들이 바뀐 데이터를 봐야한다. 
 * 		오라클은 거의 static. 그래서 이름이 공유변수. 
 * 		static은 자바에서 거의 이용하지 않는데 멤버변수를 이용하지 않을 때 static을 이용하는 것이 기본이다. 
 */
class Names{
	String name1;
	String name2;
}
public class 메소드_1 {
	// 메소드 선언 ==> 오버로딩 : 같은 클래스에서 같은 메소드를 이용해서 새로운 기능을 첨부
	//	메소드명이 동일 &(매개변수의 갯수, 데이터형이 다르면) 다른 메소드로 인식함. 
	void swap(int a, int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+",b="+b);
	}
	void swap(String name1, String name2)
	{
		String temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("swap:name1="+name1+",name2="+name2);
	}
	void swap(String[] names) // 배열
	{
		String temp = names[0];
		names[0] = names[1];
		names[1] = temp;
		
		System.out.println("swap:names[0]"+names[0]+",names[1]="+names[1]);
		
	}
	void swap(Names name)
	{
		String temp = name.name1;
		name.name1=name.name2;
		name.name2=temp;
		System.out.println("name1="+name.name1+",name2="+name.name2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 m = new 메소드_1(); // swap ==> m에 첨부된 상태
		int x = 10;
		int y = 20;
		System.out.println("main:x="+x+",y="+y);
		m.swap(x,y);
		System.out.println("main:x="+x+",y="+y); // Call By Value(값만 전송) => 메소드 안에서만 변경
		// x, y 메모리 ==> 메소드 호출(매개변수 다른 메모리가 생성) => 복사본(원본은 그대로 복사본 안에서만 변경)
		// 클래스, 배열 ==> 원본이 변경(예외=>String)
		//System.out.print();
		
		String name1="홍길동";
		String name2="박문수";
		m.swap(name1, name2);
		System.out.println("main:name1="+name1+",name2="+name2); //원본
		
		String[] names= {"이순신","강감찬"};
		m.swap(names);
		System.out.println("main:names[0]"+names[0]+",names[1]="+names[1]);//원본
		/*
		 * 값만 변경(메소드 안에서만 변경) : 일반 데이터값(기본형), String 
		 * 자체 변경(주소) : 클래스 (사용자 정의 클래스), 배열
		 * 
		 */
		Names n = new Names();
		n.name1="홍길동";
		n.name2="김두한";
		m.swap(n);
		System.out.println("name1="+n.name1+",name2="+n.name2);
		// 매개변수 => 클래스, 배열, 일반 데이터 
		// 리턴형 => 기본형, 배열, 클래스(리턴형이 없어도 된다)
		
		
	}

}
