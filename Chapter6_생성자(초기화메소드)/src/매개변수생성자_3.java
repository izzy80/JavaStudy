class Movie
{
	int mno;
	String title;
	String genre;
	
	Movie()
	{
		
	}
	// Spring, Window에서 많이 나오는데 우리는 window 안 띄워서 잘 안 씀
	Movie(Movie m) 
	{//  --------- 객체를 본 떠온 것
		System.out.println("mno:"+m.mno);
		System.out.println("title:"+m.title);
		System.out.println("genre:"+m.genre);
		
	}
}
public class 매개변수생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie();
		m1.mno=1;
		m1.title = "홍길동전";
		m1.genre = "액션";
		
		Movie m2 = new Movie(m1); // 생성자를 이용한 인스턴스 복사 : 기존에 있는 거 복사해서 사용하기 298page
		
	}

}
