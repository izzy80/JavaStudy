import java.util.Scanner;
class Student
{
	String name; // null
	int kor, eng, math; // 0,0,0
	/*Student(String n, int k, int e, int m) // 생성자
	{
		this.name = n; // 원래 this 붙어야하는게 기본인데 충돌되는 것이 없어서 this.을 생략할 수 있다. 
		kor=k;
		eng =e;
		math=m;
	}*/
	// this()(자신의 생성자) this(자신의 객체) => 295page
	// => 라이브러리
	Student(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng=eng;
		this.math=math;
	} // 우클 - source - constructor using Field - generate 를 이용하면 매개변수 생성자 틀을 만들어줌. 
	
	// 인스턴스 메소드(static빠져서)
	void print()
	{
		// this를 사용하는 곳 => 생성자, 인스턴스 메소드(static메소드는 사용이 불가능하다)
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
	}
	
}

public class 매개변수생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기서는 this사용할 수 없다. static은 공통이기 때문에
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력:");
		String name = scan.next();
		System.out.print("국어 입력:");
		int kor = scan.nextInt();
		System.out.print("영어 입력:");
		int eng = scan.nextInt();
		System.out.print("수학 입력:");
		int math = scan.nextInt();
		
		// 학생 한 명 생성
		// Student s = new Student(); (X) 오류남. default 생성자가 없기 때문에 사용 불가능
		Student hong = new Student(name, kor, eng, math);
		// 인스턴스명.메소드명() ==> 메소드 호출 과정
		hong.print();
	}

}
