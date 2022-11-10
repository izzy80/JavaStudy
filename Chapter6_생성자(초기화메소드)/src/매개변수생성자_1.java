import java.util.Scanner;
class Sawon
{
	int sabun;
	String name;
	String dept; // 부서명
	String loc; // 근무지
	long pay; // 연봉
	Sawon() 
	{
		// 임의로 초기화
		sabun=1;// 값을 안 만들어서 임의로 만들어 놓음
		name="홍길동";
		dept = "개발부";
		loc = "서울";
		pay=5000;
	}
	Sawon(int sabun, String name) // 사용자가 사번과 이름을 보내줌
	{
		this(); // 자신의 생성자 호출이 가능 ==> 매개변수가 없는 생성자 호출이 가능
		//this()는 생성자에서만 호출이 가능 => 가장 첫 줄에만 사용한다. 
		/*
		 * Sawon() 
			{
				sabun=1;
				name="홍길동";
				dept = "개발부";
				loc = "서울";
				pay=5000;
			}
			매개변수가 없는 것을 호출한다. 
			2개는 바뀌고 3개(dept, loc, pay)는 default로 들어옴
		 */
		this.sabun = sabun;
		this.name = name;
	}
	Sawon(String dept, String loc, long pay)
	{
		this();
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	Sawon(int sabun, String name, String dept, String loc, long pay) {
		this(dept, loc, pay); // 바로 위에 것을 호출한 것 [기획부, 부산, 5500]
		/*this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;*/
	}
	void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
		System.out.println("근무지:"+loc);
		System.out.println("연봉:"+pay);
	}
}
public class 매개변수생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon(); // 1, 홍길동, 개발부, 서울, 5000
		sa1.print();
		Sawon sa2=new Sawon(2,"박문수"); // 2, 박문수, null, null, 0L => this()추가하면 2, 박문수, 개발부, 서울, 5000으로 바뀜
		sa2.print();
		Sawon sa3=new Sawon("총무부","경기",4200); // 0, null, 총무부, 경기, 4200 => 1, 홍길동, 총무부, 경기, 4200
		sa3.print(); // 메모리 공간이 다르기 때문에 어떤 것은 초기화되고 어떤 것은 초기화가 안 된다 
		Sawon sa4=new Sawon(3, "김두한","기획부","부산",5500); //3, 김두한, 기획부, 부산, 5500 => 1, 홍길동, 기획부, 부산, 5500
		sa4.print();
	}

}
